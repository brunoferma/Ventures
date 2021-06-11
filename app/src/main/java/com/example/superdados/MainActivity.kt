package com.example.superdados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dados1 = findViewById(R.id.dado1) as ImageView
        val dados2 = findViewById(R.id.dado2) as ImageView
        val btn = findViewById(R.id.btnJogar) as Button
        val text = findViewById<TextView>(R.id.bemVindo)


        val player = intent.getStringExtra("nome")

        val mensage = getString(R.string.bem_vindo, player)
        text.text = mensage


        val imagems = listOf(
            R.drawable.dice_1,
            R.drawable.dice_2,
            R.drawable.dice_3,
            R.drawable.dice_4,
            R.drawable.dice_5,
            R.drawable.dice_6
        )
        btn.setOnClickListener {
            dados1.setImageResource(imagems.random())
            dados2.setImageResource(imagems.random())



        }

            }

    private fun getNumber(): Int {
        return (1..6).random()


    }


}



