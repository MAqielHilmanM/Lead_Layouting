package com.example.lead_layouting.ui.login_selector

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.lead_layouting.R
import com.example.lead_layouting.databinding.ActivityLoginSelectorBinding
import com.example.lead_layouting.databinding.FragmentLoginSelectorBinding

class LoginSelectorFragment : Fragment() {
    private var _binding: FragmentLoginSelectorBinding? = null
    val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginSelectorBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        loadData()
        setupClickListener()
    }

    private fun setupClickListener() {
        binding.apply {
            btnSignin.setOnClickListener {
                val nama = etName.text.toString()
//                Toast.makeText(
//                    requireContext(), "click sign in with name $nama", Toast.LENGTH_SHORT
//                ).show()
//
                navigateToSignIn(nama)
            }

            btnSignup.setOnClickListener {
                val nama = etName.text.toString()
//                Toast.makeText(
//                    requireContext(), "click sign up with name $nama", Toast.LENGTH_SHORT
//                ).show()

                navigateToRegister(nama)
            }
        }
    }

    private fun navigateToRegister(nama: String) {
        val direction = LoginSelectorFragmentDirections.actionLoginSelectorFragmentToRegisterFragment(nama)
        findNavController().navigate(direction)
    }

    private fun navigateToSignIn(name: String) {
        val direction = LoginSelectorFragmentDirections.actionLoginSelectorFragmentToLoginFragment(name)
        findNavController().navigate(direction)
    }

    private fun loadData() {
        // viewbinding
        binding.apply {
            tvSelectorTitle.text = "hello World"
            tvSelectorDescription.text = "Hi There, welcome to jungle"
            etName.setText("John Doe")
        }
    }
}