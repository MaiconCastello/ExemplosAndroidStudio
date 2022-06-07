package com.generation.activitiesintents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val buttonPreview = findViewById<Button>(R.id.buttonPreview)
        buttonPreview.setOnClickListener {
            finish()
        }

    }
}