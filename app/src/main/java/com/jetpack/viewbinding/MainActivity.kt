package com.jetpack.viewbinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.jetpack.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
      //  binding.lifecycleOwner = this
        binding.viewModel = viewModel

        viewModel.countUpdate.observe(this, Observer {
            binding.counterTextview.text = it.toString()
        })

        binding.startLivedataBtn.setOnClickListener {
            val intent = Intent(this, LiveDataDataBindingDemo::class.java)
            startActivity(intent)
        }

    }
}