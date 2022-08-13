package com.example.geolocalizacao

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SonsAudiosActivity : AppCompatActivity() {

    private var cow: MediaPlayer? = null
    private var dog: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sons_audios)
        // * Recuperando os arquivos de audio e armazenando nas variaveis
        // *
        cow = MediaPlayer.create(this, R.raw.cow)
        dog = MediaPlayer.create(this, R.raw.dog)
    }

    /*
    * Disparando as chamadas para os arquivos de audio
    * para o dog e a cow
    * */

    fun soundDog(@Suppress("UNUSED_PARAMETER") view: View) {
        dog!!.start()
    }

    fun soundCow(@Suppress("UNUSED_PARAMETER") view: View) {
        cow!!.start()
    }
}