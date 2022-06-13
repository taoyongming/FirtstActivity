package com.example.firtstactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.first_layout.*

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_layout)
//        val button1 : Button = findViewById(R.id.button1)
        button1.setOnClickListener{
            Toast.makeText(this,"You clicked Button 1", Toast.LENGTH_SHORT).show()
        }

    }
}