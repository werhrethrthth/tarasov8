package com.example.a8labaaaa

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Buttonr: Button = findViewById(R.id.button_red)
        val Buttong: Button = findViewById(R.id.button_green)
        val Buttonb: Button = findViewById(R.id.button_blue)
        val textView: TextView = findViewById(R.id.textView)
        val rLayout : ConstraintLayout = findViewById(R.id.root)

        Buttonr.setOnClickListener{
            textView.setText(resources.getText(R.string.red))
            rLayout.setBackgroundColor(resources.getColor(R.color.redColor, null))
            textView.setTextSize(30F)
        }
        Buttong.setOnClickListener{
            textView.setText(resources.getText(R.string.green))
            rLayout.setBackgroundColor((resources.getColor(R.color.greenColor, null)))
            textView.setTextSize(40F)
        }
        Buttonb.setOnClickListener{
            textView.setText(resources.getText(R.string.blue))
            rLayout.setBackgroundColor((resources.getColor(R.color.blueColor, null)))
            textView.setTextSize(50F)
        }
    }
}