package com.example.buttonclickapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

//    private var userInput: EditText? = null
//    private var button: Button? = null
    private var textView: TextView? = null
    //private var numTimesClicked = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userInput = findViewById<EditText>(R.id.editText)
        val button = findViewById<Button>(R.id.button)
        textView = findViewById<TextView>(R.id.textView)
        textView?.text = ""
        textView?.movementMethod = ScrollingMovementMethod()
        userInput.setText("")

        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
//                numTimesClicked += 1
//                textView?.append("The button got tapped $numTimesClicked time")
//                if (numTimesClicked != 1) {
//                    textView?.append("s\n")
//                } else {
//                    textView?.append("\n")
//                }
                textView?.append(userInput.text)
                textView?.append("\n")
//                userInput.text.clear()
                userInput.setText("")
            }
        })
    }
}