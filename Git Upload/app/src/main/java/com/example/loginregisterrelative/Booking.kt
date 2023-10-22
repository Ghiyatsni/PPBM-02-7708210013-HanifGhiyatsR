package com.example.loginregisterrelative

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.Spinner
import android.widget.Toast

class Booking : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_booking)

        val city1 = arrayOf("Bandung","Bogor","Jakarta","Semarang","Surabaya","Yogyakarta","lainnya")


            val spinner1 = findViewById<Spinner>(R.id.pilihan1)
            val arrayAdapter1 = ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,city1)
            spinner1.adapter = arrayAdapter1
            spinner1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    Toast.makeText(applicationContext,"Selected City is =" + city1[position],Toast.LENGTH_SHORT).show()
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }
        }
        val buttonClick6 = findViewById<ImageView>(R.id.kembali)
        buttonClick6.setOnClickListener(View.OnClickListener {

            val intent6 = Intent(this,Menu ::class.java)
            startActivity(intent6)
            finish()
        })
        val city = arrayOf("Bandung","Bogor","Jakarta","Semarang","Surabaya","Yogyakarta","lainnya")


        val spinner = findViewById<Spinner>(R.id.pilihan2)
        val arrayAdapter = ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,city)
        spinner.adapter = arrayAdapter
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(applicationContext,"Selected City is =" + city[position],Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
        val buttonClick7 = findViewById<Button>(R.id.kirim)
        buttonClick7.setOnClickListener(View.OnClickListener {

            val intent7 = Intent(this,Menu ::class.java)
            startActivity(intent7)
            finish()
        })

    }}