package com.example.davaleba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        findViewById<TextView>(R.id.textView).text = intent.extras?.getString("FIRSTNAME", "")
        findViewById<TextView>(R.id.textView3).text = intent.extras?.getString("LASTNAME", "")
        findViewById<TextView>(R.id.textView2).text = intent.extras?.getInt("AGE", 0).toString()
        findViewById<TextView>(R.id.textView4).text = intent.extras?.getString("EMAIL", "")
        findViewById<TextView>(R.id.textView5).text = intent.extras?.getString("PASSWORD", "")


    }
}