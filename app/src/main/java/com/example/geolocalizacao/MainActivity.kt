package com.example.geolocalizacao

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

@Suppress("UNUSED_PARAMETER")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun acessarRecuperacaoFotos(view: View) {
        val intent = Intent(this, RecuperacaoFotosActivity::class.java)
        startActivity(intent)
    }

    fun acessarAnimacao(view: View) {
        val intent = Intent(this, AnimacaoActivity::class.java)
        startActivity(intent)
    }

    fun audioManager(view: View) {
        val intent = Intent(this, SonsAudiosActivity::class.java)
        startActivity(intent)
    }

    fun usandoWebview(view: View) {
        val intent = Intent(this, UsandoWebViewActivity::class.java)
        startActivity(intent)
    }

    fun videoMediaPlayer(view: View) {
        val intent = Intent(this, VideoMediaPlayerActivity::class.java)
        startActivity(intent)
    }
}