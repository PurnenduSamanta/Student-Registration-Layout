package com.purnendu.studentregistration

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputLayout


class MainActivity : AppCompatActivity() {

    private val department= arrayListOf("IT","CSE","Mechanical","Electrical","Electronics","MCA","MBA")
    private val year= arrayListOf("2018","2019","2020","2021","2022","2023","2024")
    private lateinit var txtField1:TextInputLayout
    private lateinit var txtField2:TextInputLayout
    private lateinit var button:MaterialButton



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)


        txtField1=findViewById(R.id.textInputField1)
        txtField2=findViewById(R.id.textInputField2)
        button=findViewById(R.id.nextButtonFirstRegistration)


        val departmentSpinnerAdapter: ArrayAdapter<String> =
            ArrayAdapter<String>(this, R.layout.list_item, department)
        (txtField2.editText as? AutoCompleteTextView)?.setAdapter(departmentSpinnerAdapter)


        val yearSpinnerAdapter: ArrayAdapter<String> =
            ArrayAdapter<String>(this, R.layout.list_item, year)
        (txtField1.editText as? AutoCompleteTextView)?.setAdapter(yearSpinnerAdapter)




        button.setOnClickListener {

            val intent= Intent(this,SecondRegistrationActivity::class.java)
            startActivity(intent)
        }



    }
}
