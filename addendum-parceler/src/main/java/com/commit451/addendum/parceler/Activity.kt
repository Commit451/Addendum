@file:Suppress("NOTHING_TO_INLINE")

package com.commit451.addendum.parceler

import android.app.Activity
import android.os.Parcelable
import org.parceler.Parcels

inline fun <T> Activity.parcelerExtra(key: String): Lazy<T> {
    return lazy(LazyThreadSafetyMode.NONE) {
        @Suppress("UNCHECKED_CAST")
        intent.getParcelerParcelableExtra<T>(key) as T
    }
}

inline fun <T> Activity.parcelerExtraOrNull(key: String): Lazy<T?> {
    return lazy(LazyThreadSafetyMode.NONE) {
        @Suppress("UNCHECKED_CAST")
        val parcel = intent.getParcelableExtra<Parcelable>(key)
        if (parcel == null) {
            null
        } else {
            Parcels.unwrap<T>(parcel)
        }
    }
}