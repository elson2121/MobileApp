package com.example.simplelogin

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class EnterActivitiy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.enter)



        Toast.makeText(this, "you entered the the enter button succseflly welcome \n\nto enter ", Toast.LENGTH_SHORT).show()



        }
    }

