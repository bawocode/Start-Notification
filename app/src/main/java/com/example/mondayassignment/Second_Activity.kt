package com.example.mondayassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Second_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_)
        var switches: Bundle? = getIntent().getExtras()


        if (switches != null) {
            findViewById<TextView>(R.id.textView1).text = switches.getString("MESSAGE")
        }
    }

}