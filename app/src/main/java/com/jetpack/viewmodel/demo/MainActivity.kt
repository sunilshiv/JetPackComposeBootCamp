package com.jetpack.viewmodel.demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
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
        binding.countTxt.text =viewModel.getCurrentCount().toString()

        binding.clickHereBtn.setOnClickListener {
            binding.countTxt.text = viewModel.getUpdatedCount().toString()
        }

        binding.startNextActivity.setOnClickListener {
            val intent: Intent = Intent(this, CounterActivity::class.java)
            startActivity(intent)
        }
    }
}