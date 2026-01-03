package com.example.recycleview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val rySantri = findViewById<RecyclerView>(R.id.rySantri)

        val listSantri = listOf(
            "Ahmad", "Abdullah", "Hasan", "Husain", "Ali", "Umar", "Utsman", "Bilal", "Salman", "Anas"
        )

        val adapter = SantriAdapter(listSantri)

        rySantri.layoutManager = LinearLayoutManager(this)
        rySantri.adapter = adapter
    }
}