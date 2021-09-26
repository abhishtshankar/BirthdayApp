package com.abhisht28.birthdaycard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast


//import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun createWish(view: android.view.View) {


        Toast.makeText(this,"Button is clicked!", Toast.LENGTH_LONG).show()

        val name= findViewById<EditText>(R.id.nameInput)
        val finalName= name.editableText.toString()

        val intent= Intent(this, BirthdayGreetingActivity::class.java)
        intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA, finalName)
           startActivity(intent)


    }

}