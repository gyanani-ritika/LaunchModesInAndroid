package com.example.launchmodeexample

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val act2: Button = findViewById(R.id.button2)
        act2.setOnClickListener(View.OnClickListener {
           Utils.navigateToActivity2(this@MainActivity)
        })
        val act3: Button = findViewById(R.id.button3)
        act3.setOnClickListener(View.OnClickListener {
            val i = Intent(this@MainActivity, Activity3::class.java)
            startActivity(i)
        })
        val act4: Button = findViewById(R.id.button4)
        act4.setOnClickListener(View.OnClickListener {
            val i = Intent(this@MainActivity, Activity4::class.java)
            startActivity(i)
        })
        val act5: Button = findViewById(R.id.button5)
        act5.setOnClickListener(View.OnClickListener {
            val i = Intent(this@MainActivity, Activity5::class.java)
            startActivity(i)
        })
    }

}