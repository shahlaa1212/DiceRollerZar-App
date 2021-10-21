package com.example.dicerollerzarapp.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.dicerollerzarapp.util.NumberDice

class MainViewModel: ViewModel() {

    val image = MutableLiveData<NumberDice>()

    fun changeImageRandom(){
        image.postValue(NumberDice.values().random())
    }
}