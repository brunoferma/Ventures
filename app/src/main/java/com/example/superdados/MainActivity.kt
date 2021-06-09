package com.example.superdados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dados1 = findViewById(R.id.dados1) as TextView
        val dados2 = findViewById(R.id.dados2) as TextView
        val btn = findViewById(R.id.btnJogar) as Button

        btn.setOnClickListener {
            dados1.text = getNumber().toString()
            dados2.text = getNumber().toString()

        }
    }

    private fun getNumber() : Int {
        return (1..6).random()

    }
}


