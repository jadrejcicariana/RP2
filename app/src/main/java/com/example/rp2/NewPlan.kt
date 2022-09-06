package com.example.rp2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class NewPlan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.new_plan)

        val saveButton = findViewById<Button>(R.id.save)

        saveButton.setOnClickListener {
            startActivity(Intent(this@NewPlan, MyPlans::class.java))
        }
    }
}
