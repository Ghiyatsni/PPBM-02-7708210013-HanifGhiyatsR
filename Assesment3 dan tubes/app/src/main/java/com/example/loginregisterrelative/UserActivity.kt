package com.example.loginregisterrelative

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginregisterrelative.databinding.ActivityUserBinding


class UserActivity : AppCompatActivity() {

    private lateinit var binding: ActivityUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        val country = intent.getStringExtra("country")
        val imageId = intent.getIntExtra("imageId",R.drawable.alberto)
        val phone = intent.getStringExtra("phone")

        binding.nameProfile.text = name
        binding.countryProfile.text = country
        binding.profileImage.setImageResource(imageId)
        binding.phoneProfile.text = phone






    }
}