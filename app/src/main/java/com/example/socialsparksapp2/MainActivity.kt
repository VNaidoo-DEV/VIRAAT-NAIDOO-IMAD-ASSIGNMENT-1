package com.example.socialsparksapp2

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
//import com.google.android.material.animation.AnimationUtils
import android.view.animation.AnimationUtils

class MainActivity : AppCompatActivity() {
    lateinit var txtTime: EditText
    lateinit var btnSuggest: Button
    lateinit var btnReset: Button
    lateinit var txtResult: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        fun animateResult() {
            val anim = AnimationUtils.loadAnimation(this, R.anim.fade_in)
            txtResult.startAnimation(anim)
        }
        txtTime = findViewById(R.id.txtTime)
        btnSuggest = findViewById(R.id.btnSuggest)
        btnReset = findViewById(R.id.btnReset)
        txtResult = findViewById(R.id.txtResult)

        btnSuggest.setOnClickListener {
            val time = txtTime.text.toString()
                .trim() // Remove leading/trailing spaces
                .lowercase()//Recognizes UPPERCASES WORDS TO LOWERCASES WORDS
            //.replace("\\s+".toRegex(), "")
            Log.d("APP_DEBUG", "Time entered: $time")


            if (time.isEmpty()) {
                // Handle the case when the txtResult is empty
                Log.d("APP_DEBUG", "Empty input detected")
                txtResult.text = "Please enter a time like 'MORNING','AFTERNOON','DINNER'"
                txtResult.setTextColor(getColor(android.R.color.holo_red_dark))
                val anim= AnimationUtils.loadAnimation(applicationContext,R.anim.fade_in)
                txtResult.startAnimation(anim)
                // You can also show an error message or perform other actions here
            } else if (time=="morning") {
                Log.d("APP_DEBUG", "Morning condition executed")
                txtResult.text = " Send a 'Good Morning' text to your family members"
                txtResult.setTextColor(getColor(android.R.color.holo_orange_dark))
                val anim= AnimationUtils.loadAnimation(applicationContext,R.anim.fade_in)
                txtResult.startAnimation(anim)

            }


            else if(time.contains("mid")&&time.contains("morning")){
                Log.d("APP_DEBUG", "Mid-Morning condition executed")
                txtResult.text="Reach out to a colleague with a quick 'Thank You'"
                txtResult.setTextColor(getColor(android.R.color.holo_blue_light))
                val anim= AnimationUtils.loadAnimation(applicationContext,R.anim.fade_in)
                txtResult.startAnimation(anim)
            }


            else if(time=="afternoon"){
                Log.d("APP_DEBUG", "Afternoon condition executed")
                txtResult.text="Share a funny meme or interesting link"
                txtResult.setTextColor(getColor(android.R.color.holo_purple))
                val anim= AnimationUtils.loadAnimation(applicationContext,R.anim.fade_in)
                txtResult.startAnimation(anim)
            }



            else if(time.contains("afternoon")&&time.contains("snack time")){
                Log.d("APP_DEBUG", "Afternoon snack time condition executed")
                txtResult.text="Send a 'Thinking of you' message"
                txtResult.setTextColor(getColor(android.R.color.holo_blue_dark))
                val anim= AnimationUtils.loadAnimation(applicationContext,R.anim.fade_in)
                txtResult.startAnimation(anim)
            }



            else if (time=="dinner"){
                Log.d("APP_DEBUG", "Dinner condition executed")
                txtResult.text="Call a friend or relative for a 5 minute catch up"
                txtResult.setTextColor(getColor(android.R.color.holo_red_light))
                val anim= AnimationUtils.loadAnimation(applicationContext,R.anim.fade_in)
                txtResult.startAnimation(anim)


            }
            else if (time=="night"|| time.contains("after dinner")){
                Log.d("APP_DEBUG", "Night condition executed")
                txtResult.text="Leave a thoughtful comment on a friend's post"
                val anim= AnimationUtils.loadAnimation(applicationContext,R.anim.fade_in)
                txtResult.startAnimation(anim)


            }
            else{
                txtResult.text="Please enter a valid time. TRY: MORNING, AFTERNOON, DINNER"
                txtResult.setTextColor(getColor(android.R.color.holo_red_dark))
                val anim= AnimationUtils.loadAnimation(applicationContext,R.anim.fade_in)
                txtResult.startAnimation(anim)
            }

        }
        btnReset.setOnClickListener {
            txtTime.text.clear()
            txtResult.text="SUGGESTION WILL APPEAR HERE:"
            val anim= AnimationUtils.loadAnimation(applicationContext,R.anim.fade_in)
            txtResult.startAnimation(anim)
        } //CLEARING CONTENTS OF EDIT TEXT AND TEXT VIEW


    }
}