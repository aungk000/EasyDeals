package com.losersclub.easydeals.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.losersclub.easydeals.R
import com.losersclub.easydeals.databinding.FragmentLoginBinding

class FragmentLogin: Fragment() {
    private var binding: FragmentLoginBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.apply {
            btnSignup.setOnClickListener { signUp() }
            btnLogin.setOnClickListener { logIn() }
            btnPasswordReset.setOnClickListener { passwordReset() }
        }
    }

    private fun signUp() {
        findNavController().navigate(R.id.action_fragmentLogin_to_fragmentSignup)
    }

    private fun logIn() {

    }

    private fun passwordReset() {
        findNavController().navigate(R.id.action_fragmentLogin_to_fragmentPasswordReset)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}