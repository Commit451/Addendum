package com.commit451.addendum.sample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.commit451.addendum.bindView
import com.commit451.addendum.forEach
import com.commit451.addendum.forEachIndexed
import com.commit451.addendum.getIntExtra
import com.commit451.addendum.threetenabp.toDateAtStartOfDay
import org.threeten.bp.LocalDate

class MainActivity : AppCompatActivity() {

    val root by bindView<ViewGroup>(R.id.root)
    val textView by bindView<TextView>(R.id.text)
    val buttonSecondActivity by bindView<Button>(R.id.button_second_activity)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.text = "Hi"

        val value = intent.getIntExtra("some_key")

        buttonSecondActivity.setOnClickListener {
            val intent = Main2Activity.intent(this)
            startActivity(intent)
        }

        root.forEach { view: View ->
        }
        root.forEachIndexed { i: Int, view: View ->

        }

        val today = LocalDate.now()
        val date = today.toDateAtStartOfDay()

    }
}
