package com.example.davaleba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    lateinit var passwordTextView: TextView
    lateinit var finishButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        passwordTextView = findViewById(R.id.editText5)
        finishButton = findViewById(R.id.button)


        val firstName : String? = intent?.extras?.getString("FIRSTNAME", "")
        val lastName : String? = intent?.extras?.getString("LASTNAME", "")
        val age : Int? = intent?.extras?.getInt("AGE", 0)
        val email : String? = intent?.extras?.getString("EMAIL", "")

        finishButton.setOnClickListener {

            val password : String = passwordTextView.text.toString()

            val intent = Intent(this, MainActivity3::class.java)
            intent.putExtra("FIRSTNAME", firstName)
            intent.putExtra("LASTNAME", lastName)
            intent.putExtra("AGE", age)
            intent.putExtra("EMAIL", email)
            intent.putExtra("PASSWORD", password)
            startActivity(Intent)


        }
    }
}