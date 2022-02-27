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
import com.jetpack.navdemo1.databinding.FragmentSignUpBinding

class SignUpFragment : Fragment() {

    private lateinit var signUpBinding: FragmentSignUpBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        signUpBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_sign_up, container, false )
        signUpBinding.nextButton.setOnClickListener {
            if (!TextUtils.isEmpty(signUpBinding.enterNameTextView.text.toString())) {
                var bundle = bundleOf("name_input" to signUpBinding.enterNameTextView.text.toString())
                it.findNavController().navigate(R.id.action_signUpFragment_to_emailFragment, bundle)

            }else{
                Toast.makeText(activity, "Please enter your name", Toast.LENGTH_SHORT).show()
            }
        }
        return signUpBinding.root
    }
}