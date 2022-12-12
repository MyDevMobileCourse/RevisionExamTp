package com.example.examtprevision

import android.graphics.Color
import android.os.Bundle
import android.view.*
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    lateinit var root : LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        root = findViewById(R.id.root)
        registerForContextMenu(root)
    }
    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        menuInflater.inflate(R.menu.action_bar,menu)
        menu?.setHeaderTitle("Colors")
        super.onCreateContextMenu(menu, v, menuInfo)
    }
    override fun onContextItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.blue -> root.setBackgroundColor(Color.BLUE)
            R.id.red -> root.setBackgroundColor(Color.RED)
            R.id.green -> root.setBackgroundColor(Color.GREEN)
        }
        return super.onContextItemSelected(item)
    }


}