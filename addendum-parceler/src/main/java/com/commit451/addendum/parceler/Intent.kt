package com.commit451.addendum.parceler

import android.content.Intent
import org.parceler.Parcels

/**
 * Get Parcelable that was put in the intent using Parceler
 */
fun <T> Intent.getParcelerParcelableExtra(key: String): T? {
    return Parcels.unwrap<T>(getParcelableExtra(key))
}

/**
 * Put Parcelable in Intent that Parceler can parcel
 */
fun Intent.putParcelerParcelableExtra(key: String, thing: Any?) {
    this.putExtra(key, Parcels.wrap(thing))
}

