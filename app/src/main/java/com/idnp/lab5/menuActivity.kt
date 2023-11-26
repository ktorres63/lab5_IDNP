package com.idnp.lab5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class menuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val tvResult = findViewById<TextView>(R.id.tvUser)
        val name:String = intent.extras?.getString("user").orEmpty()
        tvResult.text = "Bienvenido ${name}"
    }
}