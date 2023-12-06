package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main8)
        val v17: ImageView = findViewById(R.id.imageView17)
        val v19: ImageView = findViewById(R.id.imageView19)
        val v20: ImageView = findViewById(R.id.imageView20)
        v17.setOnClickListener {
            val intent = Intent(this, crossbaw18::class.java)
            startActivity(intent)
        }
        v19.setOnClickListener {
            val intent = Intent(this, bashn2::class.java)
            startActivity(intent)
        }
        v20.setOnClickListener {
            val intent = Intent(this, bash3::class.java)
            startActivity(intent)
        }
    }
    fun back44 (view: View){
        val intent = Intent(this@MainActivity8,
            MainActivity4::class.java)
        startActivity(intent)
    }
}