package com.example.multiscreendataapp

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Order : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val ordersOfCustomer = intent.getStringExtra(MainActivity.KEY)
        val tvOrder = findViewById<TextView>(R.id.tvOrder)
        tvOrder.text = ordersOfCustomer.toString()

        }
}