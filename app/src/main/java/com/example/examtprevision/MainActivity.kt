package com.example.examtprevision

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.*
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    lateinit var root : LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        root = findViewById(R.id.root)
    }

    fun goto2(view:View){
        val intent = Intent(applicationContext,Activity2::class.java)
        startActivity(intent)
    }

    override fun onBackPressed() {
        val alertDialogBuilder = AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("Quit");
        alertDialogBuilder.setMessage("are you sure you want to quit ?  ?");
        alertDialogBuilder.setPositiveButton("Yes") { dialog, which ->
            super.onBackPressed()
        };
        alertDialogBuilder.setNegativeButton("No") { dialog, which ->
            Toast.makeText(
                applicationContext,
                "Canceled", Toast.LENGTH_SHORT
            ).show()
        };
        alertDialogBuilder.show();
    }


}