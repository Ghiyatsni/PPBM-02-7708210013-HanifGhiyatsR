package com.example.assesment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class adapter: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Contoh data
        val data = listOf("Bagas Pramono", "Brian Arthur p", "Yoana")

        // Buat adapter dan terapkan ke ListView
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, data)
        val listView: ListView = findViewById(R.id.listview)
        listView.adapter = adapter

        // Mengatur tindakan klik pada item ListView
        listView.setOnItemClickListener { _, _, position, _ ->
            val selectedItem = data[position]
            Toast.makeText(this, "Item clicked: $selectedItem", Toast.LENGTH_SHORT).show()
        }
    }
}

