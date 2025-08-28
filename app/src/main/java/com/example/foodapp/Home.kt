package com.example.foodapp

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        // Adjust padding for system bars
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Bottom navigation layouts
        val homeLayout = findViewById<LinearLayout>(R.id.homeLayout)
        val searchLayout = findViewById<LinearLayout>(R.id.searchLayout)
        val shopLayout = findViewById<LinearLayout>(R.id.shopLayout)
        val profileLayout = findViewById<LinearLayout>(R.id.profileLayout)

        // Click listener for Home
        homeLayout.setOnClickListener {
            // Optional: reload or add functionality
        }

        // Click listener for Search
        searchLayout.setOnClickListener {
            val intent = Intent(this, Search::class.java)
            startActivity(intent)
        }

        // Click listener for Shop
        shopLayout.setOnClickListener {

            val intent = Intent(this, Shop::class.java)
            startActivity(intent)
        }

        // Click listener for Profile
        profileLayout.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }
    }
}
