package com.pqc.android_bites.playloop

import android.os.Bundle
import android.widget.TextView
import android.view.Gravity
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tv = TextView(this)
        tv.text = "Playloop Module"
        tv.textSize = 24f
        tv.gravity = Gravity.CENTER
        setContentView(tv)
    }
}
