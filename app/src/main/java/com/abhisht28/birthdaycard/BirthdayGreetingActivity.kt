package com.abhisht28.birthdaycard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BirthdayGreetingActivity : AppCompatActivity() {

    companion object{
        const val NAME_EXTRA = "name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

            val name= intent.getStringExtra(NAME_EXTRA)


        val textView = findViewById<TextView>(R.id.birthdayGreeting)
//        textView.setOnClickListener {
//            textView.text = getString(R.string.name)
//        }
          textView.text="HAPPY BIRTHDAY\n$name...!!!"

    }
}