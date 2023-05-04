package com.example.fragments.trivia.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

import com.example.fragments.R
import com.example.fragments.databinding.FragmentQuizBinding


class QuizFragment : Fragment() {
    private lateinit var binding: FragmentQuizBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_quiz, container, false)
        checkQuizWithBinding()
        return binding.root

    }

    private fun checkQuizWithBinding() {
        val radioGroup = binding.question1RadioGroup
        binding.triviaQuizSubmitButton.setOnClickListener {
            val id = radioGroup.checkedRadioButtonId
            if (id != -1) {
                val selectedRadioBtn = binding.root.findViewById<RadioButton>(id).text.toString()
                if (selectedRadioBtn == "c++") {
                    findNavController().navigate(R.id.action_quizFragment_to_youWin)
                } else {
                    findNavController().navigate(R.id.action_quizFragment_to_tryAgain)
                }
            } else {
                Toast.makeText(requireContext(), "nothing selected", Toast.LENGTH_SHORT).show()
            }
        }
    }
}