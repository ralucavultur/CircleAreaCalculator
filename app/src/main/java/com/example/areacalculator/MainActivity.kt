package com.example.areacalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var inputValue: EditText
    private lateinit var button: Button
    private lateinit var resultText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onStart() {
        super.onStart()
        inputValue = findViewById(R.id.inputText)
        button = findViewById(R.id.button)
        resultText=findViewById(R.id.result)
        button.setOnClickListener{
            calculateArea()
        }
    }



    fun calculateArea(){
        var input = inputValue.text.toString().toDouble()
        var result = 3.14*input*input
        resultText.text= result.toString()
    }
}