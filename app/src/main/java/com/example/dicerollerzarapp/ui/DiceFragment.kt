package com.example.dicerollerzarapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.dicerollerzarapp.R
import com.example.dicerollerzarapp.databinding.FragmentDiceBinding
import com.example.dicerollerzarapp.viewModel.MainViewModel

class DiceFragment() : Fragment(R.layout.fragment_dice) {

        lateinit var binding : FragmentDiceBinding
        private val ViewModel : MainViewModel by viewModels()

        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View?{
            binding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_dice, container, false)
            binding.viewModel = ViewModel
            binding.lifecycleOwner = this
            return binding.root
        }
    }
