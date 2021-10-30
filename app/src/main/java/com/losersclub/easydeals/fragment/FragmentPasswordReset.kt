package com.losersclub.easydeals.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.losersclub.easydeals.R
import com.losersclub.easydeals.databinding.FragmentPasswordResetBinding

class FragmentPasswordReset: Fragment() {
    private var binding: FragmentPasswordResetBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_password_reset, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.apply {
            btnPasswordReset.setOnClickListener { passwordReset() }
        }
    }

    private fun passwordReset() {

    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}