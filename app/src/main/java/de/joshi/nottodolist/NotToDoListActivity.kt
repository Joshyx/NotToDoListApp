package de.joshi.nottodolist

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.MotionEvent
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.graphics.toColorLong
import java.util.*

class NotToDoListActivity : AppCompatActivity() {
    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val createTodoButton: ImageView  = findViewById(R.id.createTodoButton)
        val title: TextView  = findViewById(R.id.mainPageHeading)

        createTodoButton.setOnClickListener {
            createTodoButton.imageAlpha = 205
        }

        createTodoButton.setOnTouchListener { view, event ->
            view.performClick()

            if(event.action == MotionEvent.ACTION_UP) {
                createTodoButton.imageAlpha = 255
            }

            true
        }
    }
}