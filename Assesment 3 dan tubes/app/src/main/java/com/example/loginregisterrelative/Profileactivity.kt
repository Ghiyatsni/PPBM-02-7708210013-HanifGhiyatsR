package com.example.loginregisterrelative

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import com.ncorti.slidetoact.SlideToActView

class Profileactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profileactivity)

        val slideToActView= findViewById<SlideToActView>(R.id.geser)
        slideToActView.onSlideCompleteListener = object : SlideToActView.OnSlideCompleteListener {
            override fun onSlideComplete(view: SlideToActView) {
                Log.d("ghiyats", "slide1: " + view.text + ", id: " + view.id)

                val _intent = Intent(
                    this@Profileactivity, MainActivity::class.java
                )

                startActivity(_intent)

            }
        }

    }
}