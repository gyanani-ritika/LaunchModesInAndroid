package com.example.launchmodeexample

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Utils.printTaskId(this@BaseActivity, "onCreate")
    }

    override fun onDestroy() {
        super.onDestroy()
        Utils.printTaskId(this@BaseActivity, "onDestroy")
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Utils.printNewIntent(this@BaseActivity)
    }
}