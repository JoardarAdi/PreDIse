package com.example.predise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.login_btn).setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
        }

        findViewById<Button>(R.id.signup_btn).setOnClickListener {
            startActivity(Intent(this,PatientSignUp::class.java))
        }

    }
}