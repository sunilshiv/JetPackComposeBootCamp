package com.jetpack.viewbinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TwoWayDataBindingViewModel: ViewModel() {

    val userName = MutableLiveData<String>()

    init {
        userName.value = "Frank"
    }
}