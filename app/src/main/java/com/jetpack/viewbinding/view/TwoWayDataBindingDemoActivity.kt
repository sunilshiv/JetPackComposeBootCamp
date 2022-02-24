package com.jetpack.viewbinding.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.jetpack.viewbinding.R
import com.jetpack.viewbinding.viewmodel.TwoWayDataBindingViewModel
import com.jetpack.viewbinding.databinding.ActivityTwoWayDataBindingDemoBinding

class TwoWayDataBindingDemoActivity : AppCompatActivity() {
    private lateinit var twoWayDataBindingDemoBinding: ActivityTwoWayDataBindingDemoBinding
    private lateinit var viewModel: TwoWayDataBindingViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        twoWayDataBindingDemoBinding = DataBindingUtil.setContentView(this,
            R.layout.activity_two_way_data_binding_demo
        )
        viewModel = ViewModelProvider(this)[TwoWayDataBindingViewModel::class.java]
        twoWayDataBindingDemoBinding.twoWayDatabindingViewModel = viewModel
        twoWayDataBindingDemoBinding.lifecycleOwner = this
    }
}