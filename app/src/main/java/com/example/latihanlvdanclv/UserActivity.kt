package com.example.latihanlvdanclv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.latihanlvdanclv.databinding.ActivityMainBinding
import com.example.latihanlvdanclv.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity() {

    private lateinit var binding : ActivityUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        val phone = intent.getStringExtra("phone")
        val country = intent.getStringExtra("country")
        val imageId = intent.getIntExtra("imageId",R.drawable.maskoboy)

        binding.nameProfile.text = name
        binding.phoneProfile.text = phone
        binding.countryProfile.text = country
        binding.profileImage.setImageResource(imageId)

    }
}