package com.example.geolocalizacao


import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import kotlinx.android.synthetic.main.activity_video_media_player.*

class VideoMediaPlayerActivity : AppCompatActivity() {
    private var uri: Uri? = null
    private var isContinuously = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_media_player)

        /*
        * Aqui temos toda a mecanica de trabalhar com video
        * temos funções para start e stor, nas linhas 30 e 31
        * */

        val mediaController = MediaController(this)
        mediaController.setAnchorView(vv)
        val uriPath = "https://ia600209.us.archive.org/24/items/WildlifeSampleVideo/Wildlife.mp4"
        uri = Uri.parse(uriPath)
        vv!!.setOnCompletionListener {
            if (isContinuously) {
                vv!!.start()
            }
        }
        btnstop!!.setOnClickListener { vv!!.pause() }
        btnplay!!.setOnClickListener { vv!!.start() }
        btnonce!!.setOnClickListener {
            isContinuously = false
            progress!!.visibility = View.VISIBLE
            vv!!.setMediaController(mediaController)
            vv!!.setVideoURI(uri)
            vv!!.requestFocus()
            vv!!.start()
        }

        btnconti!!.setOnClickListener {
            isContinuously = true
            progress!!.visibility = View.VISIBLE
            vv!!.setMediaController(mediaController)
            vv!!.setVideoURI(uri)
            vv!!.requestFocus()
            vv!!.start()
        }
        vv!!.setOnPreparedListener { progress!!.visibility = View.GONE }
    }
}