package com.jetpack.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.jetpack.viewbinding.databinding.ActivityMain2Binding

class LiveDataDataBindingDemo : AppCompatActivity() {

    private lateinit var bindingDemo: ActivityMain2Binding
    private lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingDemo = DataBindingUtil.setContentView(this, R.layout.activity_main2)
        viewModel = ViewModelProvider(this)[MainActivityViewModel::class.java]
        bindingDemo.lifecycleOwner = this
        bindingDemo.liveDataViewModel = viewModel

        viewModel.countUpdate.observe(this, Observer {
            bindingDemo.countLivedataText.text = it.toString()
        })
    }
}