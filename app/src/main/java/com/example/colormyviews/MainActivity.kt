package com.example.colormyviews

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

    private fun makeColored(view: View){
        when(view.id){
            R.id.box_one_text -> view.setBackgroundResource(R.drawable.sb)
            R.id.box_two_text -> view.setBackgroundResource(R.drawable.sblogo)
            R.id.box_three_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_four_text-> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_five_text -> view.setBackgroundColor(Color.YELLOW)
            R.id.red_button -> box_three_text.setBackgroundResource(R.color.my_red)
            R.id.green_button -> box_four_text.setBackgroundResource(R.color.my_green)
            R.id.blue_button -> box_five_text.setBackgroundResource(R.color.my_blue)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

    private fun setListeners(){
        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)
        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)
        val redButton = findViewById<TextView>(R.id.red_button)
        val greenButton = findViewById<TextView>(R.id.green_button)
        val blueButton = findViewById<TextView>(R.id.blue_button)



        val clickableViews:List<View> =
            listOf(boxOneText,boxTwoText,boxThreeText,boxFourText,boxFiveText,rootConstraintLayout, redButton,greenButton,blueButton)

        for(item in clickableViews){
            item.setOnClickListener{makeColored(it)}
        }
    }
}
