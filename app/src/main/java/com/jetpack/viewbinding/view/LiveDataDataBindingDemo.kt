package com.jetpack.viewbinding.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.jetpack.viewbinding.R
import com.jetpack.viewbinding.databinding.ActivityMain2Binding
import com.jetpack.viewbinding.viewmodel.MainActivityViewModel

class LiveDataDataBindingDemo : AppCompatActivity() {

    private lateinit var bindingDemo: ActivityMain2Binding
    private lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingDemo = DataBindingUtil.setContentView(this, R.layout.activity_main2)
        viewModel = ViewModelProvider(this)[MainActivityViewModel::class.java]
        bindingDemo.lifecycleOwner = this
        bindingDemo.liveDataViewModel = viewModel
    }
}