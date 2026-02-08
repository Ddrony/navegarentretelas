package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

        // Botão para voltar à MainActivity
        val buttonBack: Button = findViewById<Button>(R.id.buttonBack)

buttonBack.setOnClickListener {
            finish() // Finaliza a SecondActivity e volta para MainActivity
        }
    }
}