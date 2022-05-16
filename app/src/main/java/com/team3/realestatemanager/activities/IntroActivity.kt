package com.team3.realestatemanager.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.team3.realestatemanager.R

class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        val btnlogin = findViewById<Button>(R.id.btn_log_in)
        val btnsignup = findViewById<Button>(R.id.btn_sign_up)

        btnlogin.setOnClickListener {
            val login = Intent(this@IntroActivity, LoginActivity::class.java)
            startActivity(login)
        }
        btnsignup.setOnClickListener {
            val signup = Intent(this@IntroActivity, SignUpActivity::class.java)
            startActivity(signup)
        }
    }
}