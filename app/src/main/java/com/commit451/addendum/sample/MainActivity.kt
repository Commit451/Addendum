package com.commit451.addendum.sample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.commit451.addendum.bindView
import com.commit451.addendum.getIntExtra

class MainActivity : AppCompatActivity() {

    val textView by bindView<TextView>(R.id.text)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.text = "Hi"

        val value = intent.getIntExtra("some_key")
    }
}
