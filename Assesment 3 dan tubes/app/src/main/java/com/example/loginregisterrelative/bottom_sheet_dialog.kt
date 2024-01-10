package com.example.loginregisterrelative

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class bottom_sheet_dialog : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_sheet_dialog)

        val buttonClick0 = findViewById<Button>(R.id.idBtnDismiss)
        buttonClick0.setOnClickListener(View.OnClickListener {

            val intent0 = Intent(this,MainActivity2 ::class.java)
            startActivity(intent0)
            finish()
        })
    }
}