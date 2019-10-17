package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //onCreate = main()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //create the UI
        //R = resources
        setContentView(R.layout.activity_main)
        //TODO : Continue here
        //Java int x; vs Kotlin var x : Int
        //val = value, var = variable
        val buttonShowName: Button = findViewById(R.id.buttonDontClickMe)
        buttonShowName.setOnClickListener{showName()}
        val buttonReset: Button = findViewById(R.id.buttonReset)
        buttonReset.setOnClickListener{reset()}

    }

    private fun showName() {
        textViewMessage.setText(getString(R.string.biqqer_than_uranus))
    }

    private fun reset(){
        textViewMessage.setText(getString(R.string.helloWorld))
    }


}
