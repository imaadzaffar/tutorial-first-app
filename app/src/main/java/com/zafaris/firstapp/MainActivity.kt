package com.zafaris.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Link activity to layout file

        // Find views from layout file
        val editName: EditText = findViewById(R.id.edit_name)
        val buttonUpdate: Button = findViewById(R.id.button_update)
        val buttonClear: Button = findViewById(R.id.button_clear)
        val textContent: TextView = findViewById(R.id.text_content)

        // Will run code every time the update button is clicked
        buttonUpdate.setOnClickListener {
            val name = editName.text.toString().trim()
            if (name.isEmpty()) {
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT).show()
            } else {
                val message = "Hi $name! Have a nice day :)"
                textContent.text = message
            }
        }

        // Will run code every time the clear button is clicked
        buttonClear.setOnClickListener {
            textContent.text = ""
        }
    }
}