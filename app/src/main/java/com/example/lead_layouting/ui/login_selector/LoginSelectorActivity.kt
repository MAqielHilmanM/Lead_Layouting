package com.example.lead_layouting.ui.login_selector

import android.app.Activity
import android.content.Context
import android.content.Intent
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
        _binding = ActivityLoginSelectorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadData()
        setupClickListener()
    }

    private fun setupClickListener() {
        binding.apply {
            btnSignin.setOnClickListener {
                val nama = etName.text
                Toast.makeText(this@LoginSelectorActivity, "click sign in with name $nama", Toast.LENGTH_SHORT).show()
            }

            btnSignup.setOnClickListener {
                val nama = etName.text
                Toast.makeText(this@LoginSelectorActivity, "click sign up with name $nama", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun loadData() {
        // ambil intent
        val name = intent.getStringExtra(EXTRA_NAME)
        val gender = intent.getBooleanExtra("extra_is_male", true)

        // umum
        val title = findViewById<TextView>(R.id.tv_selector_title)
        title.text = "asd"

        // viewbinding
        binding.apply {
            tvSelectorTitle.text = "hello World"
            tvSelectorDescription.text = "Hi There, welcome to jungle"
            etName.setText("$name ${gender.toString()}")
        }
    }

    companion object {
        const val EXTRA_NAME = "extra_name"

        fun startActivity(activity: Activity, name: String) {
            val intent = Intent(activity, LoginSelectorActivity::class.java)
            intent.putExtra(EXTRA_NAME, name)
            activity.startActivity(intent)
            activity.finish()
        }
    }
}