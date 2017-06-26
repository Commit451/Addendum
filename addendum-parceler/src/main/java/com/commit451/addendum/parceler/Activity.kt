package com.commit451.addendum.parceler

import android.app.Activity
import android.os.Parcelable
import org.parceler.Parcels

fun <T> Activity.parcelExtra(key: String): Lazy<T> {
    return lazy(LazyThreadSafetyMode.NONE) {
        @Suppress("UNCHECKED_CAST")
        intent.getParcelerParcelableExtra<T>(key) as T
    }
}

fun <T> Activity.parcelExtraOrNull(key: String): Lazy<T?> {
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