package com.commit451.addendum.sample

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.commit451.addendum.extra
import com.commit451.addendum.parceler.parcelerExtra
import com.commit451.addendum.parceler.parcelerExtraOrNull
import com.commit451.addendum.parceler.putParcelerParcelableExtra

class Main2Activity : AppCompatActivity() {

    companion object {

        const val KEY_STRING = "string"
        const val KEY_INT = "int"
        const val KEY_PARCEL = "parcel"
        const val KEY_PARCEL_THING = "parcel_thing"
        const val KEY_NOTHING = "nothing"

        fun intent(context: Context): Intent {
            val thing = Thing()
            thing.someValue = 200
            val parcelThing = ParcelThing()
            val intent = Intent(context, Main2Activity::class.java)
            intent.putExtra(KEY_STRING, "asdf")
            intent.putExtra(KEY_INT, 100)
            intent.putExtra(KEY_PARCEL, thing)
            intent.putParcelerParcelableExtra(KEY_PARCEL_THING, parcelThing)
            intent.putParcelerParcelableExtra(KEY_NOTHING, null)
            return intent
        }
    }

    val string by extra<String>(KEY_STRING)
    val someInt by extra<Int>(KEY_INT)
    val someParcel by extra<Thing>(KEY_PARCEL)
    val someParcelThing by parcelerExtra<ParcelThing>(KEY_PARCEL_THING)
    val nothing by parcelerExtraOrNull<ParcelThing>(KEY_NOTHING)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
}
