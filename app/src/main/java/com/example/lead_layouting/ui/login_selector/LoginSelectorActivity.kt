package com.example.lead_layouting.ui.login_selector

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.TextView
import android.widget.Toast
import com.example.lead_layouting.R
import com.example.lead_layouting.databinding.ActivityLoginSelectorBinding

class LoginSelectorActivity : AppCompatActivity() {
    private var _binding: ActivityLoginSelectorBinding? = null
    val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_login_selector)
        _binding = ActivityLoginSelectorBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // TODO: do something
        loadData()
        setupClickListener()
    }

    private fun setupClickListener() {
        // TODO : buat handle component click
        binding.apply {
            btnSignin.setOnClickListener {
                // TODO : if click sign in
                val nama = etName.text
                Toast.makeText(this@LoginSelectorActivity, "click sign in with name $nama", Toast.LENGTH_SHORT).show()
            }

            btnSignup.setOnClickListener {
                // TODO: if click sign up
                val nama = etName.text
                Toast.makeText(this@LoginSelectorActivity, "click sign up with name $nama", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun loadData() {
        // TODO: buat handle ketika load data diawal

        // umum
        val title = findViewById<TextView>(R.id.tv_selector_title)
        title.text = "asd"

        // viewbinding
        binding.apply {
            tvSelectorTitle.text = "hello World"
            tvSelectorDescription.text = "Hi There, welcome to jungle"
            etName.setText("Ujang")
        }
    }
}