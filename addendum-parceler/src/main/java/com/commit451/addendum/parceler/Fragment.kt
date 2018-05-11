@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.commit451.addendum.parceler

import android.support.v4.app.Fragment

inline fun <T> Fragment.parcelerArgument(key: String): Lazy<T> {
    return lazy(LazyThreadSafetyMode.NONE) {
        @Suppress("UNCHECKED_CAST")
        arguments!!.getParcelerParcelable<T>(key)!!
    }
}

inline fun <T> Fragment.parcelerArgumentOrNull(key: String): Lazy<T?> {
    return lazy(LazyThreadSafetyMode.NONE) {
        @Suppress("UNCHECKED_CAST")
        arguments?.getParcelerParcelable<T?>(key)
    }
}