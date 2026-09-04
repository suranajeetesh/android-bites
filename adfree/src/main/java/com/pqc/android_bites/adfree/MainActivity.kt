package com.pqc.android_bites.adfree

import android.os.Bundle
import android.widget.TextView
import android.view.Gravity
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tv = TextView(this)
        tv.text = "Adfree Module"
        tv.textSize = 24f
        tv.gravity = Gravity.CENTER
        setContentView(tv)
    }
}
