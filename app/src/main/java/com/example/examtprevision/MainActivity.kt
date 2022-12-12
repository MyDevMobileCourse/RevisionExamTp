package com.example.examtprevision

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showSnackbar(view:View){
        Snackbar.make(view,"This is  snackbar",Snackbar.LENGTH_LONG).setAction(
            "close"
        ) {
            print("closed")
        }
            .show()
    }
}