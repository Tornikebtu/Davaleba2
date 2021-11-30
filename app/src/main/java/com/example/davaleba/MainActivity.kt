package com.example.davaleba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var firstNameTextView: TextView
    lateinit var LastNameTextView: TextView
    lateinit var ageTextView: TextView
    lateinit var emailTextView: TextView
    lateinit var nextButton: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstNameTextView = findViewById(R.id.editText)
        LastNameTextView = findViewById(R.id.editText2)
        ageTextView = findViewById(R.id.editText3)
        emailTextView = findViewById(R.id.editText4)
        nextButton = findViewById(R.id.button2)

        nextButton.setOnClickListener {
            val firstName : String = firstNameTextView.text.toString()
            val lastname : String = LastNameTextView.text.toString()
            val age : Int = ageTextView.text.toString().toInt()
            val email : String = emailTextView.text.toString()

            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("FIRSTNAME", firstName)
            intent.putExtra("LASTNAME", lastname)
            startActivity(intent)
        }

    }
}