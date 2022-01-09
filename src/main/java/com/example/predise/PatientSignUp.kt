package com.example.predise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.widget.addTextChangedListener

class PatientSignUp : AppCompatActivity() {

    //variables that store the patient info
    private lateinit var regPatName: String
    private lateinit var regPatMail: String
    private lateinit var regPatPass: String
    private lateinit var regPatPhNo: String

    //getting the patient details
    private val patientNameED: EditText by lazy {
        findViewById(R.id.getPatName)
    }

    private val patientEmailED: EditText by lazy {
        findViewById(R.id.getPatEmail)
    }

    private val patientPasswordED: EditText by lazy {
        findViewById(R.id.getPatPass)
    }

    private val patientPhNoED: EditText by lazy {
        findViewById(R.id.getPatPhNo)
    }

    private val registerButton: Button by lazy {
        findViewById(R.id.registerBtn)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_patient_sign_up)

        regPatName = patientNameED.toString()
        regPatMail = patientEmailED.toString()
        regPatPass = patientPasswordED.toString().trim()
        regPatPhNo = patientPhNoED.toString()


        patientPasswordED.addTextChangedListener {
            if (it != null) {
                registerButton.isEnabled = !(it.isNullOrEmpty())
            }
        }

        registerButton.setOnClickListener {
            //validate(regPatName, regPatPass)
            //createUser();
            Toast.makeText(this@PatientSignUp, "User created successfully", Toast.LENGTH_LONG).show()
        }

    }
}