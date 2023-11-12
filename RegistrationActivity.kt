package com.example.mad_project_081

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class RegistrationActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        val login: Button = findViewById(R.id.register)
        login.setOnClickListener(){
            Intent(this,LoginActivity::class.java).also { startActivity(it) }
        }
    }
}