package de.joshi.nottodolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class NotToDoListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val createTodoButton: ImageView  = findViewById(R.id.createTodoButton)
        val title: TextView  = findViewById(R.id.mainPageHeading)

        createTodoButton.setOnClickListener {
            title.text = "MOIN"
        }
    }
}