package com.jetpack.viewbinding.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LiveDataViewModel(private val startingTotal: Int): ViewModel() {

    private var total = MutableLiveData<Int>()
    val totalData : LiveData<Int>
        get() = total

    val inputText = MutableLiveData<String>()

    init {
        total.value = startingTotal
    }

    fun setTotal(){
        val input: Int = inputText.value!!.toInt()
        total.value =(total.value)?.plus(input)
    }

}