package com.example.loginregisterrelative

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Menu2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu2)

        val buttonClick = findViewById<TextView>(R.id.proms)
        buttonClick.setOnClickListener(View.OnClickListener {

            val intent = Intent(this,Menu ::class.java)
            startActivity(intent)
            finish()


        })
        val buttonClick1 = findViewById<TextView>(R.id.bokung)
        buttonClick1.setOnClickListener(View.OnClickListener {

            val intent1 = Intent(this,Menu3 ::class.java)
            startActivity(intent1)
            finish()


        })
        val buttonClick21 = findViewById<ImageView>(R.id.train)
        buttonClick21.setOnClickListener(View.OnClickListener {

            val intent21 = Intent(this,Kereta ::class.java)
            startActivity(intent21)
            finish()


        })
        val buttonClick2 = findViewById<ImageView>(R.id.train)
        buttonClick2.setOnClickListener(View.OnClickListener {

            val intent2 = Intent(this,Kereta ::class.java)
            startActivity(intent2)
            finish()


        })
        val buttonClick3 = findViewById<ImageView>(R.id.pesawat1)
        buttonClick3.setOnClickListener(View.OnClickListener {

            val intent3 = Intent(this,Pesawat ::class.java)
            startActivity(intent3)
            finish()


        })
        val buttonClick4 = findViewById<ImageView>(R.id.bus)
        buttonClick4.setOnClickListener(View.OnClickListener {

            val intent4 = Intent(this,Bus ::class.java)
            startActivity(intent4)
            finish()


        })
        val buttonClick5 = findViewById<ImageView>(R.id.mobilkeren)
        buttonClick5.setOnClickListener(View.OnClickListener {

            val intent5 = Intent(this,Mobil ::class.java)
            startActivity(intent5)
            finish()


        })
        val buttonClick7 = findViewById<Button>(R.id.ayamgoreng)
        buttonClick7.setOnClickListener(View.OnClickListener {

            val intent7 = Intent(this,Booking ::class.java)
            startActivity(intent7)
            finish()
        })

    }
}