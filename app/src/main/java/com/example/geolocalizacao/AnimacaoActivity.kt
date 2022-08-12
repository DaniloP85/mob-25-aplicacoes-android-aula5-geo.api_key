package com.example.geolocalizacao

import androidx.appcompat.app.AppCompatActivity

class AnimacaoActivity : AppCompatActivity(){
    internal var animation = arrayOf(
        "Fade in",
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

    internal var animationIDs = intArrayOf(
        R.anim.blink,
    )
}