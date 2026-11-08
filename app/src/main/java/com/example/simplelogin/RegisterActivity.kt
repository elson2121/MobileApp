package com.example.simplelogin

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // Track the real elements present in our new XML wrapper
        val etUsername = findViewById<EditText>(R.id.etRegisterUsername)
        val etLastname = findViewById<EditText>(R.id.etRegisterlastname)
        val btnRegister = findViewById<Button>(R.id.btnRegisterUser)

        btnRegister.setOnClickListener {
            val newUsername = etUsername.text.toString().trim()
            val newLastname = etLastname.text.toString().trim()


            if (newUsername.isEmpty()||newLastname.isEmpty()) {
                Toast.makeText(this, "Please type a username", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Successfully Registered: $newUsername", Toast.LENGTH_SHORT).show()
Toast.makeText(this, "we love you and thanks you for registering", Toast.LENGTH_SHORT).show()
                // This is exactly where Room database will eventually write
                // the newUsername into SQLite to save it forever!
                finish()
            }
        }
    }
}
