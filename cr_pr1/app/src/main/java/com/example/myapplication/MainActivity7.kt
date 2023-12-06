package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)
        val i12: ImageView = findViewById(R.id.imageView12)
        val i11: ImageView = findViewById(R.id.imageView11)
        val i16: ImageView = findViewById(R.id.imageView16)
        i12.setOnClickListener {
            val intent = Intent(this, yarost15::class.java)
            startActivity(intent)
        }
        i11.setOnClickListener {
            val intent = Intent(this, brew16::class.java)
            startActivity(intent)
        }
        i16.setOnClickListener {
            val intent = Intent(this, firebow17::class.java)
            startActivity(intent)
        }
    }
    fun back23 (view: View){
        val intent = Intent(this@MainActivity7,
            MainActivity4::class.java)
        startActivity(intent)
    }
}