package com.example.currrency

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dollarEditText:EditText = findViewById(R.id.dollarEditText)
        val rupeeEditText: EditText = findViewById(R.id.rupeeEditText)
        val dollarToRupeeButton: Button = findViewById(R.id.dollarToRupeeButton)
        val rupeeToDollarButton: Button = findViewById(R.id.rupeeToDollarButton)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        dollarToRupeeButton.setOnClickListener{
            val dollars = dollarEditText.text.toString().toDoubleOrNull()
            if (dollars != null) {
                val rupees = dollars * 83.30
                rupeeEditText.setText(rupees.toString())
            }
        }
        rupeeToDollarButton.setOnClickListener {
            val rupees = rupeeEditText.text.toString().toDoubleOrNull()
            if (rupees != null) {
                val dollars = rupees / 83.30
                dollarEditText.setText(dollars.toString())
            }
        }

    }
}