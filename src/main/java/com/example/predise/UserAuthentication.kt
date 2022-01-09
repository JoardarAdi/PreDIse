package com.example.predise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class UserAuthentication : AppCompatActivity() {

    val verifyTb: TextView by lazy {
        findViewById(R.id.verifyTB)
    }

    val phNoDisplay: TextView by lazy{
        findViewById(R.id.phoneNumberTB)
    }

    lateinit var phoneNumer: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_authentication)


    }
}