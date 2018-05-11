@file:Suppress("NOTHING_TO_INLINE", "unused")

package com.commit451.addendum.parceler

import android.os.Bundle
import org.parceler.Parcels

/**
 * Get Parcelable that was put in the bundle using Parceler
 */
inline fun <T> Bundle.getParcelerParcelable(key: String): T? {
    return Parcels.unwrap<T>(getParcelable(key))
}

/**
 * Put Parcelable in Bundle that Parceler can parcel
 */
inline fun Bundle.putParcelerParcelable(key: String, thing: Any?) {
    this.putParcelable(key, Parcels.wrap(thing))
}

