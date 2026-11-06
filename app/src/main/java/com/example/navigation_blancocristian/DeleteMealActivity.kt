package com.example.navigation_blancocristian

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class DeleteMealActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delete_meal)

        val ivBack = findViewById<ImageView>(R.id.ivBackDelete)
        ivBack.setOnClickListener {
            finish()
        }
    }
}