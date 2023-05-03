package com.example.fragments.trivia.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

import com.example.fragments.R
import com.example.fragments.databinding.FragmentQuizBinding


class QuizFragment :Fragment() {
    private lateinit var binding: FragmentQuizBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_quiz, container, false)

        binding.triviaQuizSubmitButton.setOnClickListener {
            findNavController().navigate(R.id.action_quizFragment_to_youWin)
        }
        binding.triviaQuizLoseButton.setOnClickListener {
            findNavController().navigate(R.id.action_quizFragment_to_tryAgain)
        }

        return binding.root

    }

    private fun checkQuizAns(){

    }
}