package com.example.examtprevision

import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var yes: CheckBox
    lateinit var no: CheckBox
    lateinit var text: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        yes = findViewById(R.id.yes)
        no = findViewById(R.id.no)
        text = findViewById(R.id.result)

        yes.setOnClickListener {

            if (yes.isChecked) {
                text.text = "I have experience"
                no.isChecked = false;
            }
        }

        no.setOnClickListener {
            if (no.isChecked) {
                text.text = "I have no experience"
                yes.isChecked = false
            }

        }

    }
}