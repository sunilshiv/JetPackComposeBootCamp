package com.jetpack.databindingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.jetpack.databindingexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        activityMainBinding.submitButton.setOnClickListener {
            displayGreetings()
        }
    }

    private fun displayGreetings() {
        activityMainBinding.apply {
            greetingTextView.text = "Hello!!!  ${nameEditText.text}"
        }
    }
}