package com.example.mad_project_081

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val login: Button = findViewById(R.id.Login)
        login.setOnClickListener(){
            Intent(this,LoginActivity::class.java).also { startActivity(it) }
        }

    }
}