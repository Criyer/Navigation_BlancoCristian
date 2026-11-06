package com.example.navigation_blancocristian

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ListMealsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ativity_list_meals)

        val ivBack = findViewById<ImageView>(R.id.ivBackList)
        ivBack.setOnClickListener {
            finish()
        }

        val btnSeeDetails = findViewById<Button>(R.id.btnListSeeDetails)
        btnSeeDetails.setOnClickListener {
            startActivity(Intent(this, DetailsActivity::class.java))
        }
    }
}
