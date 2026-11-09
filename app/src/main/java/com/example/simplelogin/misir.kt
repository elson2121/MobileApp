package com.example.simplelogin

import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class misir : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.misir)

val name = findViewById<EditText>(R.id.name)


name.setOnClickListener {
    val username = name.text.toString().trim()
    if (username.isEmpty()) {
        Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT)
            .show()
        return@setOnClickListener
    }

}




    }
}

