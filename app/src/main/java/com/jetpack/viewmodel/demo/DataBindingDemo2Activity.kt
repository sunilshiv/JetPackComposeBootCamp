package com.jetpack.viewmodel.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.jetpack.viewmodel.demo.databinding.ActivityBindingDemo2Binding

class DataBindingDemo2Activity : AppCompatActivity() {

    private lateinit var binding: ActivityBindingDemo2Binding
    private lateinit var viewModel: MainActivityViewModel
    private lateinit var viewModelFactory: MainActivityViewModelFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_binding_demo2)
        viewModelFactory = MainActivityViewModelFactory(125)
        viewModel = ViewModelProvider(this, viewModelFactory)[MainActivityViewModel::class.java]

        viewModel.totalData.observe(this, Observer {
            binding.resultTextview.text = it.toString()
        })

        binding.resultBtn.setOnClickListener {
            viewModel.setTotalValue(binding.enterNumberEdittext.text.toString().toInt())
        }

    }
}