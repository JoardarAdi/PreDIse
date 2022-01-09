package com.example.predise


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.widget.addTextChangedListener



const val PHONE_NUMBER = "phoneNo"

class PatientLogin : AppCompatActivity() {

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
        setContentView(R.layout.activity_patient_login)

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
            Toast.makeText(this@PatientLogin, "User created successfully", Toast.LENGTH_LONG).show()
        }
    }
}

//private fun createUser() {
//    auth.createUserWithEmailAndPassword(regPatMail, regPatPass)
//        .addOnCompleteListener(this) { task ->
//            if (task.isSuccessful) {
//                // Sign in success, update UI with the signed-in user's information
//                Log.d(TAG, "createUserWithEmail:success")
//                val user = auth.currentUser
//                //updateData(user)
//            } else {
//                // If sign in fails, display a message to the user.
//                Log.w(TAG, "createUserWithEmail:failure", task.exception)
//                Toast.makeText(baseContext, "Authentication failed.",
//                    Toast.LENGTH_SHORT).show()
//                //updateData(null)
//            }
//        }

//    private fun updateData(user: FirebaseUser) {
//
//    }
//
//    override fun onStart() {
//        super.onStart()
//        if (auth.currentUser != null) {
//            openMain()
//        }
//    }
//
//    private fun openMain() {
//        startActivity(Intent(this, MainActivity::class.java))
//        finish()
//    }




//    private fun validate(email: String, password: String){
//
//        if(email.isEmpty()){
//            val errorToast = Toast.makeText(
//               this@PatientLogin,
//                 "Error! No Email Detected!",
//                Toast.LENGTH_SHORT
//            )
//            errorToast.show()
//        }
//
//        if (password.isEmpty()){
//            val errorToast = Toast.makeText(
//                this@PatientLogin,
//                "Error! No Password detected!",
//                Toast.LENGTH_SHORT
//            )
//            errorToast.show()
//        }
//    }
//
//}

//proceedButton.setOnClickListener {
//
//    //validate()
//    if(regPatMail.isEmpty()){
//        error("Required!")
//    }
//    if (regPatPass.isEmpty()) {
//        error("Required!")
//    }
//}

//        patientPhNoED.addTextChangedListener {
//            if (it != null) {
//                proceedButton.isEnabled = !((it.isNullOrEmpty()) || (it.length < 10))
//            }
//        }

//private fun validate() {
//
////        if(regPatName.isEmpty()){
////            val errorNameToast = Toast.makeText(
////                this@PatientLogin,
////                "Error, Please check the login Details!",
////                Toast.LENGTH_SHORT
////            )
////            errorNameToast.show()
////        }
//    if(regPatMail.isEmpty()){
////            val errorMailToast = Toast.makeText(
////                this@PatientLogin,
////                "Error! No Email Detected!",
////                Toast.LENGTH_SHORT
////            )
////
////            errorMailToast.show()
//
//        error("Required!")
//    }
//
//    if (regPatPass.isEmpty()){
////            val errorPassToast = Toast.makeText(
////                this@PatientLogin,
////                "Error! No Password Detected!",
////                Toast.LENGTH_SHORT
////            )
////            errorPassToast.show()
//        error("Required!")
//    }
//}

