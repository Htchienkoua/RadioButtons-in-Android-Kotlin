package com.example.radiobuttons

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.RadioButton

//radio buttons are useful for choices which are mutually exclusive(i.e only one choice per execution option)

class MainActivity : AppCompatActivity() {

    lateinit var linearLayout: LinearLayout
    lateinit var green: RadioButton
    lateinit var yellow: RadioButton
    lateinit var red : RadioButton
    lateinit var change : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    linearLayout = findViewById(R.id.linearlayout)
        green = findViewById(R.id.radioButtonGreen)
        red = findViewById(R.id.radioButtonRed)
        yellow = findViewById(R.id.radioButtonYellow)
        change = findViewById(R.id.ButtonChange)

        change.setOnClickListener {

            if(green.isChecked){
                linearLayout.setBackgroundColor(Color.GREEN)
            }else if(yellow.isChecked){
                linearLayout.setBackgroundColor(Color.YELLOW)
            }else{
                linearLayout.setBackgroundColor(Color.RED)
            }
        }
    }
}