package com.example.navigation_blancocristian

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAdd = findViewById<Button>(R.id.btnAddMeals)
        btnAdd.setOnClickListener {
            startActivity(Intent(this, AddMealsActivity::class.java))
        }

        val btnDelete = findViewById<Button>(R.id.btnDeleteMeals)
        btnDelete.setOnClickListener {
            startActivity(Intent(this, DeleteMealActivity::class.java))
        }

        val btnListAll = findViewById<Button>(R.id.btnListAllMeals)
        btnListAll.setOnClickListener {
            startActivity(Intent(this, ListMealsActivity::class.java))
        }

        val btnListTitle = findViewById<Button>(R.id.btnListMealsByTitle)
        btnListTitle.setOnClickListener {
            startActivity(Intent(this, SearchByTitleActivity::class.java))
        }
    }
}