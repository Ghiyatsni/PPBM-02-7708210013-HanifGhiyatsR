package com.example.loginregisterrelative

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class Bus : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bus)
        val buttonClick6 = findViewById<ImageView>(R.id.kemenu)
        buttonClick6.setOnClickListener(View.OnClickListener {

            val intent6 = Intent(this,Menu ::class.java)
            startActivity(intent6)
            finish()


        })


    }
}