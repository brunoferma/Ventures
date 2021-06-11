package com.example.superdados

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)


        val nome = findViewById<EditText>(R.id.nomeJogador)
        val botao = findViewById<Button>(R.id.btn2)
        val text = findViewById<TextView>(R.id.bemVindo)


        botao.setOnClickListener {
            var nome1 = nome.text.toString()
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra("nome", nome1)
            startActivity(intent)

        }
    }
}