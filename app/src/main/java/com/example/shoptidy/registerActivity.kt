package com.example.shoptidy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class registerActivity : AppCompatActivity() {
    lateinit var loginr: TextView
    lateinit var email: EditText
    lateinit var pass1: EditText
    lateinit var pass2: EditText
    lateinit var regbut: Button
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        loginr = findViewById(R.id.loginr)
        email = findViewById(R.id.email)
        pass1 = findViewById(R.id.password)
        pass2 = findViewById(R.id.password2)
        regbut = findViewById(R.id.register)
        auth = FirebaseAuth.getInstance()


        loginr.setOnClickListener {
            val intent = Intent(applicationContext, loginActivity::class.java)
            startActivity(intent)
            finish()
        }
        regbut.setOnClickListener {
            register()
        }
    }

    private fun register() {
        val email1 = email.text.toString()
        val pass1 = pass1.text.toString()
        val pass2 = pass2.text.toString()

        if (email1.isBlank() || pass1.isBlank() || pass2.isBlank()) {
            Toast.makeText(this, "Fill all the information above!", Toast.LENGTH_SHORT).show()
        } else if (pass1 != pass2) {
            Toast.makeText(this, "Passwords do not match", Toast.LENGTH_SHORT).show()
        } else {

            auth.createUserWithEmailAndPassword(email1, pass1).addOnCompleteListener(this) {
                if (it.isSuccessful) {
                    Toast.makeText(this, "Your account was created successfully!", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, loginActivity::class.java)
                    startActivity(intent)

                } else {
                    Toast.makeText(this, "Kindly revise your details!", Toast.LENGTH_SHORT).show()

                }
            }
        }
    }
}