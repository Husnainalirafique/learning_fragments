package com.example.fragments.trivia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import com.example.fragments.R
import com.example.fragments.databinding.ActivityTriviaBinding

class Trivia : AppCompatActivity() {
    private lateinit var binding: ActivityTriviaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_trivia)
        statusBar()

    }
    private fun statusBar() {
        val window = window
        window.statusBarColor = ContextCompat.getColor(this, R.color.initial)
    }
}