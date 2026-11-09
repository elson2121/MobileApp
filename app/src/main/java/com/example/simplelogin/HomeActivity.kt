package com.example.simplelogin

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val username = intent.getStringExtra("USER_NAME")
        val tvWelcome = findViewById<TextView>(R.id.tvWelcomeUser)


        if (username != null) {
            tvWelcome.text = "\nNICE TO SEE YOU, we love you guys $username!\nWelcome, $username! "

        }
    }
}
