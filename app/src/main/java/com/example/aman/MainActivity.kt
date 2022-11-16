package com.example.aman

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            val input=textbox.editableText.toString()
            val intent=Intent(this, BirthdayScreen ::class.java)
            intent.putExtra("input",input)
            startActivity(intent)
        }
    }
}