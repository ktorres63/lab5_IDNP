package com.idnp.lab5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    // Declarar los EditText
    private lateinit var usuarioEditText: EditText
    private lateinit var contraseniaEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnIngresar:Button = findViewById(R.id.btnLogin)


        btnIngresar.setOnClickListener(View.OnClickListener {


            usuarioEditText = findViewById(R.id.etUser)
            contraseniaEditText = findViewById(R.id.etPassw)

            val usuario: String = usuarioEditText.text.toString()
            val contrasenia: String = contraseniaEditText.text.toString()

            if (usuario == "carlos" && contrasenia == "1234") {
                val intent = Intent(this, menuActivity::class.java)
                intent.putExtra("user",usuario)
                startActivity(intent)
            } else {
                Toast.makeText(
                    applicationContext,
                    "Usuario o contraseña incorrectos",
                    Toast.LENGTH_SHORT
                ).show()
            }
        })
    }
}