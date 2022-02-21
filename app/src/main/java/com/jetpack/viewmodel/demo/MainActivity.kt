package com.jetpack.viewmodel.demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.jetpack.viewmodel.demo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel
    private lateinit var viewModelFactory: MainActivityViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModelFactory = MainActivityViewModelFactory(0)
        viewModel = ViewModelProvider(this, viewModelFactory)[MainActivityViewModel::class.java]

        viewModel.count.observe(this, Observer {
            binding.countTxt.text = it.toString()
        })

        binding.clickHereBtn.setOnClickListener {
           viewModel.updateCount()
        }

        binding.startDemo2Activity.setOnClickListener {
            val startNextActivity: Intent = Intent(this, DataBindingDemo2Activity::class.java)
            startActivity(startNextActivity)
        }

        binding.startDemo3Activity.setOnClickListener {
            val startDataBindingDemoActivity = Intent(this, DataBindingDemo3Activity::class.java)
            startActivity(startDataBindingDemoActivity)
        }

    }
}