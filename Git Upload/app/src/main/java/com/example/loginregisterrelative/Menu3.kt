package com.example.loginregisterrelative

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class Menu3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu3)

        val buttonClick = findViewById<TextView>(R.id.promolagi)
        buttonClick.setOnClickListener(View.OnClickListener {

            val intent = Intent(this,Menu ::class.java)
            startActivity(intent)
            finish()


        })
        val buttonClick1 = findViewById<TextView>(R.id.mended)
        buttonClick1.setOnClickListener(View.OnClickListener {

            val intent1 = Intent(this,Menu2 ::class.java)
            startActivity(intent1)
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
    }
}