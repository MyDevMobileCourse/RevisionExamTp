package com.example.examtprevision

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var red : RadioButton
    lateinit var green : RadioButton
    lateinit var blue : RadioButton
    lateinit var root: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        red = findViewById(R.id.red)
        green = findViewById(R.id.green)
        blue = findViewById(R.id.blue)
        root= findViewById(R.id.root)
    }

    fun changeColor(view: View){
        if (red.isChecked){
            root.setBackgroundColor(Color.RED)
        }else if (green.isChecked){
            root.setBackgroundColor(Color.GREEN)
        } else if (blue.isChecked) {
            root.setBackgroundColor(Color.BLUE)
        }
    }
}