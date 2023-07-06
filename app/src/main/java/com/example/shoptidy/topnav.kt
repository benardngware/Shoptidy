package com.example.shoptidy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class topnav : AppCompatActivity() {

    lateinit var tocartt : ImageButton
    lateinit var appname :TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_topnav)

    tocartt = findViewById(R.id.imageButton2)
    tocartt.setOnClickListener{
        val intent = Intent(this, cartActivity::class.java)
        startActivity(intent)
    }

    appname = findViewById(R.id.appname)
    appname.setOnClickListener {
        val intent = Intent (this, ListActivity::class.java)
        startActivity(intent)
    }



    }
}