package com.pqc.android_bites.ratenudge

import android.os.Bundle
import android.widget.TextView
import android.view.Gravity
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tv = TextView(this)
        tv.text = "Ratenudge Module"
        tv.textSize = 24f
        tv.gravity = Gravity.CENTER
        setContentView(tv)
    }
}
