package com.example.predise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.widget.addTextChangedListener

const val DISEASE_NAME = "DISEASE IS: "

class PredictDiseaseActivity : AppCompatActivity() {

    private lateinit var symptom1: String
    private lateinit var symptom2: String
    private lateinit var symptom3: String
    private lateinit var symptom4: String
    private lateinit var symptom5: String
    private lateinit var predictedSymptom: String

    private val symp1tTb: EditText by lazy {
        findViewById(R.id.symp1TB)
    }

    private val symp2tTb: EditText by lazy {
        findViewById(R.id.symp2TB)
    }

    private val symp3tTb: EditText by lazy {
        findViewById(R.id.symp3TB)
    }

    private val symp4tTb: EditText by lazy {
        findViewById(R.id.symp4TB)
    }

    private val symp5tTb: EditText by lazy {
        findViewById(R.id.symp5TB)
    }

    private val predictButton: Button by lazy {
        findViewById(R.id.predictDiseaseBtn)
    }

//    private val diseaseDisplay: TextView by lazy {
//        findViewById(R.id.diseaseDisplayTB)
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_predict_disease)

        predictedSymptom = "Not yet encountered!"


        symp2tTb.addTextChangedListener {
            predictButton.isEnabled = !(it.isNullOrEmpty())
        }

        predictButton.setOnClickListener {

            displayDisease()
        }
    }

    private fun displayDisease() {

        symptom1 = symp1tTb.text.toString()
        symptom2 = symp2tTb.text.toString()
        symptom3 = symp3tTb.text.toString()
        symptom4 = symp4tTb.text.toString()
        symptom5 = symp5tTb.text.toString()

        if (symptom1 == "headache")
            if (symptom2 == "muscle pain") {
                if (symptom3 == "vomit") {
                    if (symptom4 == "nausea") {
                        if (symptom5 == "diarrhoea") {
                            predictedSymptom = "You have MALARIA"
                        } else {
                            predictedSymptom = "You have DENGUE"
                        }
                    } else {
                        predictedSymptom = "You have TYPHOID"
                    }
                } else {
                    predictedSymptom = "You have CHIKUNGUNYA"
                }
            }

        Toast.makeText(this@PredictDiseaseActivity, predictedSymptom, Toast.LENGTH_SHORT).show()

    }


}
