package com.example.geolocalizacao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_animacao.*


class AnimacaoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animacao)

        lv.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, animations)
        lv.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            val animation = AnimationUtils.loadAnimation(this, animationsIds[position])
            tv.startAnimation(animation)
        }
    }

    // nomes dos efeitos
    internal var animations = arrayOf(
        "Fade In",
        "Fade Out",
        "Zoom In",
        "Zoom Out",
        "Blink",
        "Rotate",
        "Move",
        "Slide Up",
        "Slide Down",
        "Bounce"
    )

    // ids dos efeitos criados na para anim
    internal var animationsIds = intArrayOf(
        R.anim.fade_in,
        R.anim.fade_out,
        R.anim.zoom_in,
        R.anim.zoom_out,
        R.anim.blink,
        R.anim.rotate,
        R.anim.move,
        R.anim.slide_up,
        R.anim.slide_down,
        R.anim.bounce,
    )
}