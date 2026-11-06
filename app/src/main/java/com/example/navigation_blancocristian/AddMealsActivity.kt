package com.example.navigation_blancocristian

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class AddMealsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_meals)

        val ivBack = findViewById<ImageView>(R.id.ivBackAdd)
        ivBack.setOnClickListener {
            finish()
        }
    }
}
