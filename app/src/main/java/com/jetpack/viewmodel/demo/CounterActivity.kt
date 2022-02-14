package com.jetpack.viewmodel.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.jetpack.viewmodel.demo.databinding.ActivityCounterBinding

class CounterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCounterBinding
    private lateinit var viewModel: MainActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_counter)
        viewModel = ViewModelProvider(this)[MainActivityViewModel::class.java]
        binding.resultTextview.text = viewModel.getTotalValue().toString()

        binding.resultBtn.setOnClickListener {
            viewModel.setTotalValue(binding.enterNumberEdittext.text.toString().toInt())
            binding.resultTextview.text = viewModel.getTotalValue().toString()
        }




    }
}