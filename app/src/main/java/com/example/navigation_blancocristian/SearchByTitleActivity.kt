package com.example.navigation_blancocristian

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class SearchByTitleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_by_title)

        val ivBack = findViewById<ImageView>(R.id.ivBackSearch)
        ivBack.setOnClickListener {
            finish()
        }

        val btnSeeDetails = findViewById<Button>(R.id.btnSeeDetails)
        btnSeeDetails.setOnClickListener {
            startActivity(Intent(this, DetailsActivity::class.java))
        }
    }
}
