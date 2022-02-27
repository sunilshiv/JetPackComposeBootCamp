package com.jetpack.navdemo1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.jetpack.navdemo1.databinding.FragmentWelcomeLandingBinding

class WelcomeLandingFragment : Fragment() {

    private lateinit var welcomeLandingBinding: FragmentWelcomeLandingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        welcomeLandingBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_welcome_landing, container, false )
        val name = arguments?.getString("name_input")
        val emailId = arguments?.getString("email_input")
        welcomeLandingBinding.welcomeNameText.text = name
        welcomeLandingBinding.welcomeEmailText.text = emailId
        welcomeLandingBinding.welcomeTermsBtn.setOnClickListener {
            it.findNavController().navigate(R.id.action_welcomeLandingFragment_to_termsFragment)
        }
        return welcomeLandingBinding.root
    }

}