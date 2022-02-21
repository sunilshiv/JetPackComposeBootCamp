package com.jetpack.viewmodel.demo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingTotal: Int): ViewModel() {

    var count = MutableLiveData<Int>()

    private var totalValue = MutableLiveData<Int>()
    val totalData: LiveData<Int>
    get() = totalValue

    init {
        count.value = 0
        totalValue.value = startingTotal
    }

    fun updateCount(){
        count.value = (count.value)?.plus(1)
    }

    fun setTotalValue(input: Int) {
        totalValue.value = (totalValue.value)?.plus(input)
    }
}