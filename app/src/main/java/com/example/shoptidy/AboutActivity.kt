package com.example.shoptidy

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class AboutActivity : AppCompatActivity() {
    lateinit var insta : ImageView
    lateinit var twit : ImageView
    lateinit var call : ImageView
    lateinit var email : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        insta = findViewById(R.id.toinsta)
        twit = findViewById(R.id.totwitt)
        call = findViewById(R.id.tocall)
        email = findViewById(R.id.toemail)

        insta.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://instagram.com/sho.ptidy?igshid=MzNlNGNkZWQ4Mg=="))
            startActivity(browserIntent)
        }
        twit.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/hihibena?t=GQJdt0qBDeL-DPpT9x_jJA&s=09"))
            startActivity(browserIntent)
        }

        call.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + "0792130190")
            startActivity(dialIntent)
        }

        email.setOnClickListener {
            val emailIntent = Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "shoptidy@gmail.com", null))
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "FEEDBACK:")
            emailIntent.putExtra(Intent.EXTRA_TEXT, "Dear Sir/Madam,...")
            startActivity(Intent.createChooser(emailIntent, "Send email..."))
        }



    }
}