package com.example.predise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.strictmode.InstanceCountViolation
import android.widget.Button
import android.widget.EditText
import androidx.core.widget.addTextChangedListener
import org.w3c.dom.Text
import android.widget.Toast

const val PATIENT_NAME = "Patien 1"

class LoginActivity : AppCompatActivity() {

    val emailTB: EditText by lazy {
        findViewById(R.id.usernameTB)
    }

    val passTB: EditText by lazy{
        findViewById(R.id.passwordTB)
    }

    val loginButton: Button by lazy {
        findViewById(R.id.confirm_login)
    }

    private lateinit var email: String
    private lateinit var pass: String

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        emailTB.addTextChangedListener {
            loginButton.isEnabled = !(it.isNullOrEmpty())
        }

        loginButton.setOnClickListener {
            checkCredentials()
        }
    }

    private fun checkCredentials() {
        email = emailTB.text.toString()
        pass = passTB.text.toString()

        if(email == "pat1@mail.com" && pass == "pat1"){
            startActivity(Intent(this, PatientDashboard::class.java).putExtra(PATIENT_NAME, "Pat 1"))   //change this to patient dashboard!!!
            finish()
        }
        else{
            val errorToast = Toast.makeText(
                this@LoginActivity,
                "Error, Please check the login Details!",
                Toast.LENGTH_SHORT
            )
            errorToast.show()
        }
    }


}