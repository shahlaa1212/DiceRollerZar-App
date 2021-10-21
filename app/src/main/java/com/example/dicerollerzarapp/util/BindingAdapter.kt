package com.example.dicerollerzarapp.util

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.example.dicerollerzarapp.R

@BindingAdapter(value = ["imageZar"])
fun setMyColors(view: ImageView, numberDice: NumberDice?){
    when(numberDice){
        NumberDice.ONE -> view.setImageResource(R.drawable.alea1)
        NumberDice.TWO -> view.setImageResource(R.drawable.alea2)
        NumberDice.THREE -> view.setImageResource(R.drawable.alea3)
        NumberDice.FOUR -> view.setImageResource(R.drawable.alea4)
        NumberDice.FIVE -> view.setImageResource(R.drawable.alea5)
        NumberDice.SIX -> view.setImageResource(R.drawable.alea6)
    }
}