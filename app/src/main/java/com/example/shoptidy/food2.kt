package com.example.shoptidy

import android.content.Intent
import android.graphics.Paint
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class food2 : AppCompatActivity() {

    lateinit var call : ImageView
    lateinit var email : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food2)

        call = findViewById(R.id.tocall)
        email = findViewById(R.id.toemail)



        call.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + "079000190")
            startActivity(dialIntent)
        }

        email.setOnClickListener {
            val emailIntent = Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "fyuiy@gmail.com", null))
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "FEEDBACK:")
            emailIntent.putExtra(Intent.EXTRA_TEXT, "Dear Sir/Madam,...")
            startActivity(Intent.createChooser(emailIntent, "Send email..."))
        }

    }
}



