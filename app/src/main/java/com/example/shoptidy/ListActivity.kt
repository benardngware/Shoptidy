package com.example.shoptidy

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.cardview.widget.CardView
import kotlinx.coroutines.NonCancellable
import kotlin.system.exitProcess

class ListActivity : AppCompatActivity() {
    lateinit var about : ImageView
    lateinit var logout : ImageView
    lateinit var womencloth1 : CardView
    lateinit var womencloth2 : CardView
    lateinit var womencloth3 : CardView
    lateinit var womencloth4 : CardView
    lateinit var womencloth5 : CardView
    lateinit var mencloth1 : CardView
    lateinit var mencloth2 : CardView
    lateinit var mencloth3 : CardView
    lateinit var mencloth4 : CardView
    lateinit var mencloth5 : CardView
    lateinit var meat1a : CardView
    lateinit var meat2a : CardView
    lateinit var meat3a : CardView
    lateinit var meat4a : CardView
    lateinit var fooda : CardView
    lateinit var foodb : CardView
    lateinit var foodc : CardView
    lateinit var foodd : CardView
    lateinit var foode : CardView
    lateinit var jua1 : CardView
    lateinit var jua2 : CardView
    lateinit var jua3 : CardView
    lateinit var jua4 : CardView
    lateinit var jua5 : CardView
    lateinit var jew1 : CardView
    lateinit var jew2 : CardView
    lateinit var jew3 : CardView
    lateinit var jew4 : CardView
    lateinit var jew5 : CardView
    lateinit var cartbtn : ImageButton




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)




        about = findViewById(R.id.menuabout)

        about.setOnClickListener {
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }
        logout=findViewById(R.id.LOGOUT)
        logout.setOnClickListener {

            var box = AlertDialog.Builder(this)
            box.setMessage("Do you want to leave this application?")
            box.setNegativeButton("PROCEED", DialogInterface.OnClickListener { dialog, id -> finishAffinity() })
            box.setPositiveButton("CANCEL", DialogInterface.OnClickListener { dialog, id -> NonCancellable.cancel() })

            var alert = box.create()
            alert.setTitle("Shoptidy")
            alert.show()
        }




        //women
        womencloth1 = findViewById(R.id.women1)
        womencloth1.setOnClickListener {
            val intent = Intent(this, women1activity::class.java)
            startActivity(intent)
        }
        womencloth2 = findViewById(R.id.women2)
        womencloth3 = findViewById(R.id.women3)
        womencloth4 = findViewById(R.id.women4)
        womencloth5 = findViewById(R.id.women5)

        womencloth2.setOnClickListener {
            val intent = Intent(this, women2::class.java)
            startActivity(intent)
        }
        womencloth3.setOnClickListener {
            val intent = Intent(this, women3::class.java)
            startActivity(intent)
        }
        womencloth4.setOnClickListener {
            val intent = Intent(this, women4::class.java)
            startActivity(intent)
        }
        womencloth5.setOnClickListener {
            val intent = Intent(this, women5::class.java)
            startActivity(intent)
        }


        //men

        mencloth1 = findViewById(R.id.men1)
        mencloth2 = findViewById(R.id.men2)
        mencloth3 = findViewById(R.id.men3)
        mencloth4 = findViewById(R.id.men4)
        mencloth5 = findViewById(R.id.men5)


        mencloth1.setOnClickListener {
            val intent = Intent(this, men1::class.java)
            startActivity(intent)
        }
        mencloth2.setOnClickListener {
            val intent = Intent(this, men2::class.java)
            startActivity(intent)
        }
        mencloth3.setOnClickListener {
            val intent = Intent(this, men3::class.java)
            startActivity(intent)
        }
        mencloth4.setOnClickListener {
            val intent = Intent(this, men4::class.java)
            startActivity(intent)
        }
        mencloth5.setOnClickListener {
            val intent = Intent(this, men5::class.java)
            startActivity(intent)
        }


        //
        jew1 = findViewById(R.id.jew1)
        jew2 = findViewById(R.id.jew2)
        jew3 = findViewById(R.id.jew3)
        jew4 = findViewById(R.id.jew4)
        jew5 = findViewById(R.id.jew5)


        jew1.setOnClickListener {
            val intent = Intent(this, jew1activity::class.java)
            startActivity(intent)
        }
        jew2.setOnClickListener {
            val intent = Intent(this, jew2act::class.java)
            startActivity(intent)
        }
        jew3.setOnClickListener {
            val intent = Intent(this, jew3act::class.java)
            startActivity(intent)
        }
        jew4.setOnClickListener {
            val intent = Intent(this, jew4act::class.java)
            startActivity(intent)
        }
        jew5.setOnClickListener {
            val intent = Intent(this, jew5act::class.java)
            startActivity(intent)
        }

        //

        meat1a = findViewById(R.id.cardmutton)
        meat2a = findViewById(R.id.cardbeef)
        meat3a = findViewById(R.id.cardrabbit)
        meat4a = findViewById(R.id.cardnuggets)

        meat1a.setOnClickListener {
            val intent = Intent(this, meat1::class.java)
            startActivity(intent)
        }
        meat2a.setOnClickListener {
            val intent = Intent(this, meat2::class.java)
            startActivity(intent)
        }
        meat3a.setOnClickListener {
            val intent = Intent(this, meat3::class.java)
            startActivity(intent)
        }
        meat4a.setOnClickListener {
            val intent = Intent(this, meat4::class.java)
            startActivity(intent)
        }

        //

        jua1 = findViewById(R.id.berryjuice)
        jua2 = findViewById(R.id.bananajuice)
        jua3 = findViewById(R.id.mangojuice)
        jua4 = findViewById(R.id.melonjuice)
        jua5 = findViewById(R.id.orangejuice)

        jua1.setOnClickListener {
            val intent = Intent(this , juice1::class.java)
            startActivity(intent)
        }
        jua2.setOnClickListener {
            val intent = Intent(this, juice2::class.java)
            startActivity(intent)
        }

        jua3.setOnClickListener {
            val intent = Intent(this, juice3::class.java)
            startActivity(intent)
        }

        jua4.setOnClickListener {
            val intent = Intent(this, juice4::class.java)
            startActivity(intent)
        }


        jua5.setOnClickListener {
            val intent = Intent(this , juice5::class.java)
            startActivity(intent)
        }


        //

        fooda = findViewById(R.id.cardcaviar)
        foodb = findViewById(R.id.cardbackedfish)
        foodc = findViewById(R.id.cardshrimp)
        foodd = findViewById(R.id.octopus)
        foode = findViewById(R.id.cardfish)


        fooda.setOnClickListener {
            val intent = Intent(this, food1::class.java)
            startActivity(intent)
        }
        foodb.setOnClickListener {
            val intent = Intent(this, food2::class.java)
            startActivity(intent)
        }
        foodc.setOnClickListener {
            val intent = Intent(this, food3::class.java)
            startActivity(intent)
        }
        foodd.setOnClickListener {
            val intent = Intent(this, food4::class.java)
            startActivity(intent)
        }
        foode.setOnClickListener {
            val intent = Intent(this, food5::class.java)
            startActivity(intent)
        }












    }
}


