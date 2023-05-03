package com.example.fragments.trivia.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.fragments.R
import com.example.fragments.databinding.FragmentYouWinBinding


class YouWin :Fragment() {
    private lateinit var binding: FragmentYouWinBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_you_win, container, false)
        return binding.root

    }
}