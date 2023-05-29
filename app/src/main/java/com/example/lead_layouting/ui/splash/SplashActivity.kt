package com.example.lead_layouting.ui.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.example.lead_layouting.R
import com.example.lead_layouting.ui.login_selector.LoginSelectorActivity
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        lifecycleScope.launch {
            delay(2000)
            navigateToSelector()
        }
    }

    private fun navigateToSelector(){
//        val intent = Intent(this, LoginSelectorActivity::class.java)
//        intent.putExtra("extra_name", "Hello World")
//        intent.putExtra("extra_is_male", false)
//        startActivity(intent)

        LoginSelectorActivity.startActivity(this, "haii")
    }
}