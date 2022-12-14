package com.example.ocean

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMuda = findViewById<Button>(R.id.btnMuda)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)
        val etName = findViewById<EditText>(R.id.etName)

        btnMuda.setOnClickListener {
            val nomeDigitado = etName.text

            if(nomeDigitado.isBlank()){
                tvResultado.error = getString(R.string.digite_um_nome_valido)
            }else{
                tvResultado.text = nomeDigitado
            }
        }
        val btnAbrirNovaTela = findViewById<Button>(R.id.btnAbrirNovaTela)
        btnAbrirNovaTela.setOnClickListener{
            val novaTelaIntent = Intent(this,  ResultadoActivity::class.java)

            val nomeDigitado = etName.text.toString()
            novaTelaIntent.putExtra("NOME_DIGITADO", nomeDigitado)

            startActivity(novaTelaIntent)
        }

        // Carregamento dos dados da API
        val retrofit = Retrofit.Builder()
            .baseUrl("https://backend-livro-android-casa-cod.herokuapp.com/")

        //

        // Fim da construcao da lista
    }
}