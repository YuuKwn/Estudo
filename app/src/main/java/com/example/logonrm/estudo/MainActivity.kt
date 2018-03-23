package com.example.logonrm.estudo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


   button.setOnClickListener(){
       val gasolina = editText.text.toString().toDouble()
       val alcool = editText2.text.toString().toDouble()
       val resultado = gasolina / alcool


   }



    }
}



