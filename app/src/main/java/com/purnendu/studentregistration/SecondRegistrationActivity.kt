package com.purnendu.studentregistration

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton

class SecondRegistrationActivity : AppCompatActivity() {

    private lateinit var button:MaterialButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_registration)

        button=findViewById(R.id.nextButtonFirstRegistration)


        button.setOnClickListener {

            val intent= Intent(this,DashBoard::class.java)
            startActivity(intent)
        }




    }
}