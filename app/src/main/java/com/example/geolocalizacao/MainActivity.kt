package com.example.geolocalizacao

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myapplication.AnimacaoActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun acessarRecuperacaoFotos(view: View) {
           /* val intent = Intent(this, RecuperacaoFotosActivity::class.java)
            startActivity(intent)*/
        }

        fun acessarAnimacao(view: View) {
            val intent = Intent(this, AnimacaoActivity::class.java)
            startActivity(intent)
        }
    }
}