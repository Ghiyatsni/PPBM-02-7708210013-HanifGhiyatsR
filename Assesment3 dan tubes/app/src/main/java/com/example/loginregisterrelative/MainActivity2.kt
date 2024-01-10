package com.example.loginregisterrelative


import MyAdapter
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity2 : AppCompatActivity() {
    lateinit var tabLayout: TabLayout
    lateinit var viewPager: ViewPager
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        title = "KotlinApp"
        tabLayout = findViewById(R.id.tabLayout)
        viewPager = findViewById(R.id.viewPager)
        tabLayout.addTab(tabLayout.newTab().setText("Promo %"))
        tabLayout.addTab(tabLayout.newTab().setText("Recommended"))
        tabLayout.addTab(tabLayout.newTab().setText("Booking"))
        tabLayout.tabGravity = TabLayout.GRAVITY_FILL
        val adapter = MyAdapter(this, supportFragmentManager,
            tabLayout.tabCount)
        viewPager.adapter = adapter
        viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                viewPager.currentItem = tab.position
            }
            override fun onTabUnselected(tab: TabLayout.Tab) {}
            override fun onTabReselected(tab: TabLayout.Tab) {}
        })
        val buttonClick2 = findViewById<ImageView>(R.id.train)
        buttonClick2.setOnClickListener(View.OnClickListener {

            val intent2 = Intent(this, Kereta ::class.java)
            startActivity(intent2)
            finish()


        })
        val buttonClick3 = findViewById<ImageView>(R.id.pesawat1)
        buttonClick3.setOnClickListener(View.OnClickListener {

            val intent3 = Intent(this, Pesawat ::class.java)
            startActivity(intent3)
            finish()


        })
        val buttonClick4 = findViewById<ImageView>(R.id.bus)
        buttonClick4.setOnClickListener(View.OnClickListener {

            val intent4 = Intent(this, Bus ::class.java)
            startActivity(intent4)
            finish()


        })
        val buttonClick5 = findViewById<ImageView>(R.id.mobilkeren)
        buttonClick5.setOnClickListener(View.OnClickListener {

            val intent5 = Intent(this, Mobil ::class.java)
            startActivity(intent5)
            finish()


        })
        val buttonClick6 = findViewById<ImageView>(R.id.balikkemain)
        buttonClick6.setOnClickListener(View.OnClickListener {

            val intent6 = Intent(this, MainActivity::class.java)
            startActivity(intent6)
            finish()


        })
        val buttonClick7 = findViewById<Button>(R.id.buttonbook)
        buttonClick7.setOnClickListener(View.OnClickListener {

            val intent7 = Intent(this, Booking::class.java)
            startActivity(intent7)
            finish()


        })

    }
}