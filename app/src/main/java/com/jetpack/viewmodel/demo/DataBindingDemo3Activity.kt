package com.jetpack.viewmodel.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.jetpack.viewmodel.demo.databinding.ActivityDatabindingDemo3Binding

class DataBindingDemo3Activity : AppCompatActivity() {

    private lateinit var demo3Binding: ActivityDatabindingDemo3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        demo3Binding = DataBindingUtil.setContentView(this, R.layout.activity_databinding_demo3)
       demo3Binding.student = getStudentDetails()

    }

    private fun getStudentDetails(): Student {
       return Student(1, "sunil", "sunil.d.shiv@gmail.com")
    }
}