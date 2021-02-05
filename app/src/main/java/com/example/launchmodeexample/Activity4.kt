package com.example.launchmodeexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class Activity4 : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_4)
       val actmain: Button = findViewById(R.id.buttonmain)
        actmain.setOnClickListener(View.OnClickListener {
            val i = Intent(this@Activity4, MainActivity::class.java)
            startActivity(i)
        })
        val act2: Button = findViewById(R.id.button2)
        act2.setOnClickListener(View.OnClickListener {
            Utils.navigateToActivity2(this@Activity4)
        })
        val act3: Button = findViewById(R.id.button3)
        act3.setOnClickListener(View.OnClickListener {
            val i = Intent(this@Activity4, Activity3::class.java)
            startActivity(i)
        })
        val act5: Button = findViewById(R.id.button5)
        act5.setOnClickListener(View.OnClickListener {
            val i = Intent(this@Activity4, Activity5::class.java)
            startActivity(i)
        })
    }

}