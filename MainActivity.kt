//
 
app/src/main/java/com/example/privacyanalyzer/MainActivity.kt
package com.example.privacyanalyzer

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.editTextAppUrl)
        val button = findViewById<Button>(R.id.buttonAnalyze)
        val textView = findViewById<TextView>(R.id.textViewResult)

        button.setOnClickListener {
            val appUrl = editText.text.toString().trim()
            if (appUrl.isNotEmpty()) {
                textView.text = "Analyzing $appUrl...\nThis app may request Camera and Location permissions. Use with caution."
            } else {
                textView.text = "Please enter an app URL."
            }
        }
    }
}

