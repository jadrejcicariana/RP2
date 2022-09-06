package com.example.rp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.example.rp2.data.models.plans

class MyPlans : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.my_plans)

        val arrayAdapter: ArrayAdapter<*>


        var mListView = findViewById<ListView>(R.id.plan_list)
        val newPlanButton = findViewById<Button>(R.id.new_plan)

        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, plans)
        mListView.adapter = arrayAdapter

        mListView.onItemClickListener = AdapterView.OnItemClickListener {
                parent, view, position, id ->
            val selectedItemText = parent.getItemAtPosition(position)

            startActivity(Intent(this@MyPlans, Plan::class.java))
        }
        newPlanButton.setOnClickListener {
            startActivity(Intent(this@MyPlans, NewPlan::class.java))
        }


    }
}