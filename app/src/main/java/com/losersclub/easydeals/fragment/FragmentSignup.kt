package com.losersclub.easydeals.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.losersclub.easydeals.R
import com.losersclub.easydeals.databinding.FragmentSignupBinding

class FragmentSignup: Fragment() {
    private var binding: FragmentSignupBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_signup, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.apply {
            btnSignup.setOnClickListener {  }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}