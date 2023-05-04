package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout


class MainActivity : AppCompatActivity() {
    lateinit var tilNumOne: TextInputLayout
    lateinit var etNumOne: TextInputEditText
    lateinit var tilNumTwo: TextInputLayout
    lateinit var etNumberTwo: TextInputEditText
    lateinit var btnMultiply: Button
    lateinit var btnModulus: Button
    lateinit var btnSubtract: Button
    lateinit var btnAdd: Button
    lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        castViews()
    }
    fun  castViews() {
        tilNumOne = findViewById(R.id.tilNumOne)
        tilNumTwo = findViewById((R.id.tilNumTwo))
        etNumOne = findViewById(R.id.etNumOne)
        etNumberTwo = findViewById(R.id.etNumberTwo)
        btnMultiply = findViewById(R.id.btnMultiply)
        btnAdd = findViewById(R.id.btnAdd)
        btnModulus = findViewById(R.id.btnModulus)
        btnSubtract = findViewById(R.id.btnSubtract)
        tvResult = findViewById(R.id.tvResult)
        validate()

    }

    fun validate(){

        btnAdd.setOnClickListener{
            var numOne = etNumOne.text.toString().toInt()
            var numTwo = etNumberTwo.text.toString().toInt()
        var output = numOne + numTwo
            tvResult.text =output.toString()
        }
        btnSubtract.setOnClickListener{
            var numOne = etNumOne.text.toString().toInt()
            var numTwo = etNumberTwo.text.toString().toInt()
            var output = numOne - numTwo
            tvResult.text = output.toString()
        }
        btnMultiply.setOnClickListener{
            var numOne = etNumOne.text.toString().toInt()
            var numTwo = etNumberTwo.text.toString().toInt()
            var output = numOne * numTwo
            tvResult.text = output.toString()
        }
        btnModulus.setOnClickListener{
            var numOne = etNumOne.text.toString().toInt()
            var numTwo = etNumberTwo.text.toString().toInt()
            var output = numOne % numTwo
            tvResult.text = output.toString()
        }
    }

}


