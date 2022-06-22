package com.example.herculesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class homeScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)

        val search: Button = findViewById (R.id.search)

        search.setOnClickListener() {
            val intent = Intent(this, homeScreen::class.java)
            startActivity(intent)
        }
    }
}