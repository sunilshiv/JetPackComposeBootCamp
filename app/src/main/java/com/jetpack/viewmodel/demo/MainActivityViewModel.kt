package com.jetpack.viewmodel.demo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingTotal: Int): ViewModel() {
    private var count = 0

    private var totalValue = MutableLiveData<Int>()
    val totalData: LiveData<Int>
    get() = totalValue

    init {
        count = startingTotal
        totalValue.value = startingTotal
    }

    fun getCurrentCount(): Int{
        return count
    }

    fun getUpdatedCount(): Int{
        return ++count
    }

    fun setTotalValue(input: Int) {
        totalValue.value = (totalValue.value)?.plus(input)
    }
}