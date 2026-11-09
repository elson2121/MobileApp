package com.example.simplelogin

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val username = intent.getStringExtra("USER_NAME")
        val tvWelcome = findViewById<TextView>(R.id.tvWelcomeUser)
        val tvDashboardTitle = findViewById<TextView>(R.id.tvDashboardTitle)


        if (username != null) {
            tvWelcome.text = "\nNICE TO SEE YOU, we love you guys $username!\nWelcome, $username! "
            tvDashboardTitle.text = "hi this is from the  dashboard  "

        }
    }
}
