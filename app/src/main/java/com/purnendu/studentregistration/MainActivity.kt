package com.purnendu.studentregistration

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import com.google.android.material.button.MaterialButton


class MainActivity : AppCompatActivity() {

    private val department= arrayListOf("IT","CSE","Mechanical","Electrical","Electronics","MCA","MBA")
    private val year= arrayListOf("2018","2019","2020","2021","2022","2023","2024")
    private lateinit var spinnerYear: Spinner
    private lateinit var spinnerDepartment: Spinner
    private lateinit var button:MaterialButton



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)


        spinnerDepartment=findViewById(R.id.permanantAddressEditText)
        spinnerYear=findViewById(R.id.editTextName)
        button=findViewById(R.id.nextButtonFirstRegistration)


        val departmentSpinnerAdapter: ArrayAdapter<String> =
            ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, department)
        departmentSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerDepartment.adapter = departmentSpinnerAdapter


        val yearSpinnerAdapter: ArrayAdapter<String> =
            ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, year)
        yearSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerYear.adapter = yearSpinnerAdapter


        button.setOnClickListener {

            val intent= Intent(this,SecondRegistrationActivity::class.java)
            startActivity(intent)
        }



    }
}
