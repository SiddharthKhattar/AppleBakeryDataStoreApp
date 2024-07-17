package com.example.multiscreendataapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    // Creating a key using companion object
    companion object{
        const val KEY = "com.example.multiscreendataapp.MainActivity.KEY"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val eT1 = findViewById<EditText>(R.id.eT1)
        val eT2 = findViewById<EditText>(R.id.eT2)
        val eT3 = findViewById<EditText>(R.id.eT3)
        val eT4 = findViewById<EditText>(R.id.eT4)

        val btnOrder = findViewById<Button>(R.id.btnOrder)
        btnOrder.setOnClickListener{
            val ordersPlaced = eT1.text.toString() + " \n " + eT2.text.toString() + "\n " +
             eT3.text.toString() + " \n " + eT4.text.toString()

            intent = Intent(this, Order::class.java)
            intent.putExtra(KEY, ordersPlaced)
            startActivity(intent)
        }
    }
}
