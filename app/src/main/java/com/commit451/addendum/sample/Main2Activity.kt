package com.commit451.addendum.sample

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.commit451.addendum.extra
import junit.framework.Assert

class Main2Activity : AppCompatActivity() {

    companion object {

        const val KEY_STRING = "string"
        const val KEY_INT = "int"
        const val KEY_PARCEL = "parcel"

        fun intent(context: Context): Intent {
            val thing = Thing()
            thing.someValue = 200
            val intent = Intent(context, Main2Activity::class.java)
            intent.putExtra(KEY_STRING, "asdf")
            intent.putExtra(KEY_INT, 100)
            intent.putExtra(KEY_PARCEL, thing)
            return intent
        }
    }

    val string by extra<String>(KEY_STRING)
    val someInt by extra<Int>(KEY_INT)
    val someParcel by extra<Thing>(KEY_PARCEL)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        Assert.assertEquals("asdf", string)
        Assert.assertEquals(100, someInt)
        Assert.assertEquals(200, someParcel.someValue)
    }
}
