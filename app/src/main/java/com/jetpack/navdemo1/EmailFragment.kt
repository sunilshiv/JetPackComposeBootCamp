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
import com.jetpack.navdemo1.databinding.FragmentEmailBinding

class EmailFragment : Fragment() {

    private lateinit var binding: FragmentEmailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_email, container, false)
        val name: String? = arguments?.getString("name_input")

        binding.sumbitButton.setOnClickListener {
            if (!TextUtils.isEmpty(binding.enterEmailEditTxt.text.toString())) {
                val bundle = bundleOf("email_input" to binding.enterEmailEditTxt.text.toString(),
                "name_input" to name)

                it.findNavController().navigate(R.id.action_emailFragment_to_welcomeLandingFragment, bundle)

            } else {
                Toast.makeText(activity, "Please enter your email id", Toast.LENGTH_SHORT).show()
            }
        }

        return binding.root
    }

}