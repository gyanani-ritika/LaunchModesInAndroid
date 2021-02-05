package com.example.launchmodeexample

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log

import androidx.appcompat.app.AppCompatActivity




class Utils {
    companion object {
        fun navigateToActivity2(activity: Activity) {
            val intent = Intent(activity, Activity2::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP  )
            activity.startActivity(intent)
//            activity.finish()

        }
        fun printTaskId(activity: Activity, state: String){
            Log.i("TESTING", state+": " + activity.javaClass.simpleName + " -- TASK ID: " + activity.taskId)
        }
        fun printNewIntent(activity: Activity){
            Log.i("TESTING", activity.javaClass.simpleName+ "-onNewIntent")

        }
    }
}


