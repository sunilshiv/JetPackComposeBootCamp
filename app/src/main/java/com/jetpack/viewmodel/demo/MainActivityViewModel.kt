package com.jetpack.viewmodel.demo

import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingTotal: Int): ViewModel() {
    private var count = 0
    private var totalValue = 0

    init {
        count = startingTotal
        totalValue = startingTotal
    }

    fun getCurrentCount(): Int{
        return count
    }

    fun getUpdatedCount(): Int{
        return ++count
    }

    fun getTotalValue(): Int{
        return totalValue
    }

    fun setTotalValue(input: Int) {
        totalValue += input
    }
}