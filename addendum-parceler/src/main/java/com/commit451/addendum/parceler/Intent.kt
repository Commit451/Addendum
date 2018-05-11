@file:Suppress("NOTHING_TO_INLINE")

package com.commit451.addendum.parceler

import android.content.Intent
import org.parceler.Parcels

/**
 * Get Parcelable that was put in the intent using Parceler
 */
inline fun <T> Intent.getParcelerParcelableExtra(key: String): T? {
    return Parcels.unwrap<T>(getParcelableExtra(key))
}

/**
 * Put Parcelable in Intent that Parceler can parcel
 */
inline fun Intent.putParcelerParcelableExtra(key: String, thing: Any?) {
    this.putExtra(key, Parcels.wrap(thing))
}

