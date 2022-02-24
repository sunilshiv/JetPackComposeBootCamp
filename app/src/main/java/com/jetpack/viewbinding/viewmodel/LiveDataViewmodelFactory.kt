package com.jetpack.viewbinding.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.jetpack.viewbinding.view.LiveDataBindingDemo2Activity

class LiveDataViewmodelFactory(private val startingTotal: Int): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(LiveDataViewModel::class.java)) {
            return LiveDataViewModel(startingTotal) as T
        }
        throw IllegalAccessException("Unknown view model class")
    }

}