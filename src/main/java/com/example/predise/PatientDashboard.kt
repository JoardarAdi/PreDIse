package com.example.predise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.net.Uri
import android.widget.Button
import android.widget.Toast

class PatientDashboard : AppCompatActivity() {

    private val predictDiseaseBtn: Button by lazy{
        findViewById(R.id.predictBtn)
    }

    private val searchDoctorBtn: Button by lazy{
        findViewById(R.id.searchDocBtn)
    }

    private val searchHospitalBtn: Button by lazy{
        findViewById(R.id.searchHosBtn)
    }

    private val updateInfoBtn: Button by lazy{
        findViewById(R.id.updateDetailsBtn)
    }

    private val feedbackBtn: Button by lazy{
        findViewById(R.id.feedbackBtn)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_patient_dashboard)

        predictDiseaseBtn.setOnClickListener {
            startActivity(Intent(this, PredictDiseaseActivity::class.java))
        }

        searchDoctorBtn.setOnClickListener{
            val openUrl1 = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?tbs=lf:1,lf_ui:2&tbm=lcl&sxsrf=AOaemvK9kIAZimPTNZG2P2WtxMdHEqHPLA:1641013266180&q=doctors+near+me&rflfq=1&num=10&sa=X&ved=2ahUKEwi_g7Xm4o_1AhUj73MBHXZKAZMQjGp6BAgEEFc&biw=1325&bih=667&dpr=1#rlfi=hd:;si:;mv:[[22.4824248,88.3215494],[22.461870899999997,88.29842939999999]];tbs:lrf:!1m4!1u3!2m2!3m1!1e1!1m4!1u2!2m2!2m1!1e1!1m4!1u16!2m2!16m1!1e1!1m4!1u16!2m2!16m1!1e2!2m1!1e2!2m1!1e16!2m1!1e3!3sIAE,lf:1,lf_ui:2"))
            startActivity(openUrl1)
        }

        searchHospitalBtn.setOnClickListener {
            val openUrl2 = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=hospitals+near+me&biw=1325&bih=667&tbm=lcl&sxsrf=AOaemvJvFiQVpLGOkWvqRCQrrMp1UwELRw%3A1641013339529&ei=W-DPYf7iH9WnoASPiqWACw&oq=hospitals+near+me&gs_l=psy-ab.3..0i433i457i67k1j0i402k1l2j0i67k1l2j0i512i433i131k1j0i512k1l4.335761.339525.0.339699.21.17.0.1.1.0.304.2348.0j8j4j1.13.0....0...1c.1.64.psy-ab..7.14.2351...35i39k1j0i433i131i67k1j0i512i433k1j0i433i67k1j0i512i263i433i20k1j0i512i263i20k1j0i457i67k1j0i512i10k1j0i433i131i10k1j0i10k1.0.7w9oLIw2N5I#rlfi=hd:;si:;mv:[[22.515372499999998,88.3493695],[22.4493632,88.2974643]];tbs:lrf:!1m4!1u3!2m2!3m1!1e1!1m4!1u2!2m2!2m1!1e1!1m4!1u16!2m2!16m1!1e1!1m4!1u16!2m2!16m1!1e2!2m1!1e2!2m1!1e16!2m1!1e3!3sIAE,lf:1,lf_ui:2"))
            startActivity(openUrl2)
        }

        updateInfoBtn.setOnClickListener {
            //startActivity(Intent(this, UpdateDetailsActivity::class.java))
            Toast.makeText(this@PatientDashboard, "Coming Soon", Toast.LENGTH_LONG).show()
        }

        feedbackBtn.setOnClickListener {
            //startActivity(Intent(this, FeedbackActivity::class.java))
            Toast.makeText(this@PatientDashboard, "Coming Soon", Toast.LENGTH_LONG).show()
        }
    }
}