package com.commit451.addendum.sample

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.*
import com.commit451.addendum.bindView
import com.commit451.addendum.getIntExtra
import com.commit451.addendum.threetenabp.toDateAtStartOfDay
import com.commit451.addendum.updateMargins
import com.google.android.material.bottomnavigation.BottomNavigationView
import org.threeten.bp.LocalDate
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    val root by bindView<ViewGroup>(R.id.root)
    val buttonSecondActivity by bindView<Button>(R.id.buttonSecondActivity)
    val bottomNavigationView by bindView<BottomNavigationView>(R.id.bottomNavigationView)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val value = intent.getIntExtra("some_key")
        Timber.d("value $value")

        buttonSecondActivity.setOnClickListener {
            val intent = Main2Activity.intent(this)
            startActivity(intent)
        }

        root.forEach { view: View ->
            Timber.d("For each - view: $view")
        }
        root.forEachIndexed { i: Int, view: View ->
            Timber.d("For each indexed - view: $view index: $i")
        }

        val today = LocalDate.now()
        val date = today.toDateAtStartOfDay()

        root.doOnLayout {
            Timber.d("onGlobalLayout width: ${root.width}")
        }

        root.doOnPreDraw {
            Timber.d("onPreDraw width: ${root.width}")
        }

        buttonSecondActivity.updateMargins(top = 400)
        buttonSecondActivity.updatePadding(left = 200)
    }
}
