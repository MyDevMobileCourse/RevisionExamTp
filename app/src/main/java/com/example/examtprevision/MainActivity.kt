package com.example.examtprevision

import android.graphics.Color
import android.os.Bundle
import android.view.*
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    lateinit var root : LinearLayout
    lateinit var button : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        root = findViewById(R.id.root)
        button = findViewById(R.id.btn)

        button.setOnClickListener {
            val popumenu = PopupMenu(this,button)
            menuInflater.inflate(R.menu.action_bar,popumenu.menu)
            popumenu.setOnMenuItemClickListener {
                when(it.itemId){
                    R.id.red -> {
                        root.setBackgroundColor(Color.RED)
                        true
                    }
                    R.id.blue -> {
                        root.setBackgroundColor(Color.BLUE)
                        true
                    }
                    R.id.green -> {
                        root.setBackgroundColor(Color.GREEN)
                        true
                    }
                    else -> {false}
                }
            }
                popumenu.show()
        }
    }


}