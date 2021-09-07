package it.leddaz.statusbarheight

import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.graphics.drawable.ColorDrawable
import android.view.View


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        display()
        val colorDrawable = ColorDrawable(Color.parseColor("#B00020"))
        supportActionBar?.setBackgroundDrawable(colorDrawable)
    }

    private fun getStatusBarHeight(): Int {
        var result = 0
        val resourceId = resources.getIdentifier("status_bar_height", "dimen", "android")
        if (resourceId > 0) {
            result = resources.getDimensionPixelSize(resourceId)
        }
        return result
    }

    private fun display() {
        val height = findViewById<TextView>(R.id.heightStr)
        val str = getStatusBarHeight().toString() + "px"
        height.text = str
    }

    fun sendMessage(view: View) {
        display()
    }
}