 package com.jetpack.viewbinding.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.jetpack.viewbinding.R
import com.jetpack.viewbinding.databinding.ActivityLiveDataBindingDemo2Binding
import com.jetpack.viewbinding.viewmodel.LiveDataViewModel
import com.jetpack.viewbinding.viewmodel.LiveDataViewmodelFactory

 class LiveDataBindingDemo2Activity : AppCompatActivity() {

    private lateinit var binding: ActivityLiveDataBindingDemo2Binding
    private lateinit var liveDataViewModel: LiveDataViewModel
    private lateinit var liveDataViewmodelFactory: LiveDataViewmodelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_live_data_binding_demo2)
        liveDataViewmodelFactory = LiveDataViewmodelFactory(10)
        liveDataViewModel = ViewModelProvider(this, liveDataViewmodelFactory)[LiveDataViewModel::class.java]
        binding.liveDataViewModel = liveDataViewModel
        binding.lifecycleOwner = this
    }
}