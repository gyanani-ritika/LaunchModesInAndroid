package com.example.launchmodeexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class Activity3 : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)
        val actmain: Button = findViewById(R.id.buttonmain)
        actmain.setOnClickListener(View.OnClickListener {
            val i = Intent(this@Activity3, MainActivity::class.java)
            startActivity(i)

        })
        val act2: Button = findViewById(R.id.button2)
        act2.setOnClickListener(View.OnClickListener {
            Utils.navigateToActivity2(this@Activity3)
        })
        val act4: Button = findViewById(R.id.button4)
        act4.setOnClickListener(View.OnClickListener {
            val i = Intent(this@Activity3, Activity4::class.java)
            startActivity(i)
        })
        val act5: Button = findViewById(R.id.button5)
        act5.setOnClickListener(View.OnClickListener {
            val i = Intent(this@Activity3, Activity5::class.java)
            startActivity(i)
        })
    }

}