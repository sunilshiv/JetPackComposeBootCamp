package com.jetpack.navdemo1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.jetpack.navdemo1.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

    private lateinit var secondBinding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        secondBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_second, container, false)
        var person_name: String? = arguments?.getString("person_name")
        secondBinding.textView.text = person_name.toString()
        return secondBinding.root
    }

}