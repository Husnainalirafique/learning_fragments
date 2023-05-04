package com.example.fragments.trivia.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.fragments.R
import com.example.fragments.databinding.FragmentTryAgainBinding


class TryAgain :Fragment() {
    private lateinit var binding: FragmentTryAgainBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_try_again, container, false)
        binding.tryAgain.setOnClickListener {
            findNavController().navigate(R.id.action_tryAgain_to_quizFragment)
        }
        return binding.root

    }
}