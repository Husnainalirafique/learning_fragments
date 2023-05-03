package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.fragments.databinding.ActivityCreatingAndReplacingBinding
import com.example.fragments.fragments.Fragment1
import com.example.fragments.fragments.Fragment2

class CreatingAndReplacing : AppCompatActivity() {
    private lateinit var binding: ActivityCreatingAndReplacingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_creating_and_replacing)
        //handling clicks

        binding.appCompatButton1.setOnClickListener {
            replace(Fragment1())
        }
        binding.appCompatButton2.setOnClickListener {
            replace(Fragment2())
        }
    }
    private fun replace(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.layoutForFragments, fragment)
            .commit()
    }
}