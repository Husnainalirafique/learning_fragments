package com.example.fragments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import com.example.fragments.databinding.ActivityMainBinding
import com.example.fragments.trivia.Trivia

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        //handling Clicks
        handlingClicks()
        //handling status bar
        statusBar()

    }
    private fun handlingClicks() {
        binding.creatingAndReplacing.setOnClickListener {
            startActivity(Intent(this, CreatingAndReplacing::class.java))
        }
        binding.btToNavigationComponent.setOnClickListener {
            startActivity(Intent(this, Trivia::class.java))
        }
    }

    private fun statusBar() {
        val window = window
        window.statusBarColor = ContextCompat.getColor(this, R.color.initial)
    }

}