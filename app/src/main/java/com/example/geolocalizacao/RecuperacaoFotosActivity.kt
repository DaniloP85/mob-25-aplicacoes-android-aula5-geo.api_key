package com.example.geolocalizacao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_recuperacao_fotos.*

class RecuperacaoFotosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recuperacao_fotos)

        /*
        * Aqui podemos entender como funciona o carremento de imagens da internet
        *
        * foram carregadas algumas imgens do site: https://images.pexels.com/photos/
        *
        * */

        val equipes = arrayOf("Leão", "Pinguin", "Urso", "Girafa", "Tigre", "Rato")

        textView1.text = equipes[0]
        textView2.text = equipes[1]
        textView3.text = equipes[2]
        textView4.text = equipes[3]
        textView5.text = equipes[4]
        textView6.text = equipes[5]

        val enteredImages ="https://images.pexels.com/photos/"

        val i1 = "${enteredImages}1362012/pexels-photo-1362012.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"
        val i2 = "${enteredImages}2078478/pexels-photo-2078478.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"
        val i3 = "${enteredImages}35435/pexels-photo.jpg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"
        val i4 = "${enteredImages}1319515/pexels-photo-1319515.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"
        val i5 = "${enteredImages}162203/panthera-tigris-altaica-tiger-siberian-amurtiger-162203.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"
        val i6 = "${enteredImages}301448/pexels-photo-301448.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"

        Glide.with(this).load(i1).into(imageView1!!)
        Glide.with(this).load(i2).into(imageView2!!)
        Glide.with(this).load(i3).into(imageView3!!)
        Glide.with(this).load(i4).into(imageView4!!)
        Glide.with(this).load(i5).into(imageView5!!)
        Glide.with(this).load(i6).into(imageView6!!)
    }
}