package com.example.loginregisterrelative

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class Kereta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kereta)

        val buttonClick6 = findViewById<ImageView>(R.id.kemenu)
        buttonClick6.setOnClickListener(View.OnClickListener {

            val intent6 = Intent(this,MainActivity2 ::class.java)
            startActivity(intent6)
            finish()


        })


    }
}