package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.ImageView

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        val iV18: ImageView = findViewById(R.id.imageView18)
        val iV15: ImageView = findViewById(R.id.imageView15)
        val iV13: ImageView = findViewById(R.id.imageView13)
        val iV9: ImageView = findViewById(R.id.imageView9)
        val iV10: ImageView = findViewById(R.id.imageView10)
        val iV14: ImageView = findViewById(R.id.imageView14)
        iV18.setOnClickListener {
            val intent = Intent(this, knight9::class.java)
            startActivity(intent)
        }
        iV15.setOnClickListener {
            val intent = Intent(this, megan10::class.java)
            startActivity(intent)
        }
        iV13.setOnClickListener {
            val intent = Intent(this, plamen11::class.java)
            startActivity(intent)
        }
        iV9.setOnClickListener {
            val intent = Intent(this, vozdshar12::class.java)
            startActivity(intent)
        }
        iV10.setOnClickListener {
            val intent = Intent(this, hog13::class.java)
            startActivity(intent)
        }
        iV14.setOnClickListener {
            val intent = Intent(this, magluch14::class.java)
            startActivity(intent)
        }
    }
    fun btn6 (View: View) {
        val intent = Intent(this@MainActivity5,
            MainActivity4::class.java)
        startActivity(intent)

    }


}