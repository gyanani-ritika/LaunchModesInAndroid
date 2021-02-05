package com.example.launchmodeexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class Activity2 : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val actmain: Button = findViewById(R.id.buttonmain)
            actmain.setOnClickListener(View.OnClickListener {
                val i = Intent(this@Activity2, MainActivity::class.java)
                startActivity(i)

            })
            val act3: Button = findViewById(R.id.button3)
            act3.setOnClickListener(View.OnClickListener {
                val i = Intent(this@Activity2, Activity3::class.java)
                startActivity(i)

            })
            val act4: Button = findViewById(R.id.button4)
            act4.setOnClickListener(View.OnClickListener {
                val i = Intent(this@Activity2, Activity4::class.java)
                startActivity(i)
            })
            val act5: Button = findViewById(R.id.button5)
            act5.setOnClickListener(View.OnClickListener {
                val i = Intent(this@Activity2, Activity5::class.java)
                startActivity(i)
            })
        }

    }
