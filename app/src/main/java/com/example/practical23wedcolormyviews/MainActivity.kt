package com.example.practical23wedcolormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun makeColored(view: View) {

        when (view.id) {
            // Boxes using custom colors for background
            R.id.red_button -> box_three_text.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> box_four_text.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> box_five_text.setBackgroundResource(R.color.my_green)
            R.id.pink_button -> box_eight_text.setBackgroundResource(R.color.my_pink)
            R.id.orange_button -> box_nine_text.setBackgroundResource(R.color.my_orange)
            R.id.blue_button -> box_ten_text.setBackgroundResource(R.color.my_blue)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }

    }

    private fun setListeners() {

        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)
        val boxSixText = findViewById<TextView>(R.id.box_six_text)
        val boxSevenText = findViewById<TextView>(R.id.box_seven_text)
        val boxEightText = findViewById<TextView>(R.id.box_eight_text)
        val boxNineText = findViewById<TextView>(R.id.box_nine_text)
        val boxTenText = findViewById<TextView>(R.id.box_ten_text)

        val redButton = findViewById<TextView>(R.id.red_button)
        val greenButton = findViewById<TextView>(R.id.green_button)
        val yellowButton = findViewById<TextView>(R.id.yellow_button)
        val pinkButton = findViewById<TextView>(R.id.pink_button)
        val orangeButton = findViewById<TextView>(R.id.orange_button)
        val blueButton = findViewById<TextView>(R.id.blue_button)

        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)

        val clickableViews: List<View> =
            listOf(
                boxOneText, boxTwoText, boxThreeText,
                boxFourText, boxFiveText, boxSixText, boxSevenText, boxEightText, boxNineText, boxTenText,
                rootConstraintLayout,
                redButton, greenButton, yellowButton, pinkButton, orangeButton, blueButton
            )
        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }
}











