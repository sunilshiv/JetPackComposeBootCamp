package com.jetpack.navdemo1

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.jetpack.navdemo1.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var homeBinding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        homeBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        homeBinding.button.setOnClickListener {
            if(!TextUtils.isEmpty(homeBinding.editTextTextPersonName.text.toString())) {
                val bundle: Bundle = bundleOf("person_name" to homeBinding.editTextTextPersonName.text.toString())
                it.findNavController().navigate(R.id.action_homeFragment_to_secondFragment, bundle)
            }else{
                Toast.makeText(requireActivity(), "Please enter your name", Toast.LENGTH_SHORT).show()
            }
        }

        homeBinding.signupButton.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_signUpFragment)
        }
        homeBinding.termsButton.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_termsFragment)
        }
        return homeBinding.root
    }

}