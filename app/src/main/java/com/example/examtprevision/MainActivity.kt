package com.example.examtprevision

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    lateinit var myText :TextView
    lateinit var myButton : Button
    lateinit var myEditText : EditText
    lateinit var myImage : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myText = findViewById(R.id.mytext)
        myButton = findViewById(R.id.mybutton)
        myEditText = findViewById(R.id.myEditText)
        myImage = findViewById(R.id.myImage)
        myText.isVisible = false
        myImage.isVisible = false
        myButton.setOnClickListener {
            if(myEditText.text.toString().isBlank()){
                myText.setTextColor(Color.BLACK)
                myText.setBackgroundColor(Color.WHITE)
                myText.text = "Hello Dsi 31"
                myImage.setImageResource(R.drawable.ic_launcher_background)
                myImage.setColorFilter(Color.RED)
            }else{
                myText.text = myEditText.text.toString()
                myImage.setImageResource(R.drawable.ic_launcher_foreground)
                myImage.setColorFilter(Color.GREEN)

            }
            myText.isVisible = true
            myImage.isVisible = true


        }

    }
}