package com.rohitmaurya.constraintlayoutexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        /*When to use guidelines*/

        //Assume you want to restrict the above-mentioned TextView heights to 30% of screen height, no matter the content they have.
    }
}