package com.example.shoptidy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class loginActivity : AppCompatActivity() {
    lateinit var email :EditText
    lateinit var pass :EditText
    lateinit var logbut :Button
    lateinit var regr :TextView
    private lateinit var auth :FirebaseAuth




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        email = findViewById(R.id.email)
        pass = findViewById(R.id.password)
        logbut = findViewById(R.id.login)
        regr = findViewById(R.id.regist)
        auth= FirebaseAuth.getInstance()

        regr.setOnClickListener {
            val intent = Intent(this, registerActivity::class.java)
            startActivity(intent)
        }

        logbut.setOnClickListener {
            login()
        }


    }

    fun login(){
        val email = email.text.toString()
        val pass = pass.text.toString()

        if (email.isBlank()){
            Toast.makeText(this, "Fill in your account Email!", Toast.LENGTH_SHORT).show()
        }else if (pass.isBlank()){
            Toast.makeText(this, "Fill in your account Password!", Toast.LENGTH_SHORT).show()
        }else{
            auth.signInWithEmailAndPassword(email, pass).addOnCompleteListener(this){
                if (it.isSuccessful){
                    val intent = Intent(this, ListActivity::class.java)
                    startActivity(intent)
                }else{
                    Toast.makeText(this, "Incorrect Credentials", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}