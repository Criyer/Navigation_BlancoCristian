package com.example.navigation_blancocristian

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val ivBack = findViewById<ImageView>(R.id.ivBackDetails)
        ivBack.setOnClickListener {
            finish()
        }
    }
}