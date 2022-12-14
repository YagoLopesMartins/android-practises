package com.example.ocean

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import java.util.*
import kotlin.collections.ArrayList

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val btnvoltarTelaPrincipal = findViewById<Button>(R.id.btnvoltarTelaPrincipal)

        val nomeDigitado= intent.getStringExtra("NOME_DIGITADO")

        val tvNome = findViewById<TextView>(R.id.tvNome)
        tvNome.text = nomeDigitado

        btnvoltarTelaPrincipal.setOnClickListener{
            val novaTelaIntent = Intent(this,  MainActivity::class.java)
            startActivity(novaTelaIntent)
        }

//        List<String> students = new ArrayList<>(Arrays.asList("1","2","3"));
//
//        ListView listaAlunos = findViewById(R.id.rv_list);
    }
}