package com.example.loginregisterrelative

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginregisterrelative.databinding.ActivityMain3Binding


class MainActivity3 : AppCompatActivity() {

    private lateinit var binding: ActivityMain3Binding
    private lateinit var userArrayList: ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)


        val imageId = intArrayOf(

            R.drawable.admincowo,R.drawable.admincewe

        )

        val name = arrayOf(


            "Admin Complain","Admin Booking"

        )

        val lastMessage = arrayOf(


            "", ""

        )

        val lastMsgTime = arrayOf(

            "",""

        )

        val country = arrayOf(

            "Indonesia","Indonesia"

        )

        val phoneNo = arrayOf(

            "081316827728","0895804720974"
        )

        userArrayList = ArrayList()

        for(i in name.indices){

            val user = User(name[i],lastMessage[i],lastMsgTime[i],country[i],phoneNo[i],imageId[i])
            userArrayList.add(user)
        }

        binding.listview.isClickable = true
        binding.listview.adapter = MyAdapter2(this,userArrayList)
        binding.listview.setOnItemClickListener { parent, view, position, id ->

            val name = name[position]
            val country = country[position]
            val imageId = imageId[position]
            val phone = phoneNo[position]

            val i = Intent(this,UserActivity::class.java)
            i.putExtra("name",name)
            i.putExtra("country", country)
            i.putExtra("imageId", imageId)
            i.putExtra("phone", phone)
            startActivity(i)
        }
    }
}