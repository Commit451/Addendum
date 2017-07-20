package com.commit451.addendum


import android.support.annotation.IdRes
import android.support.v4.app.Fragment
import android.view.View

inline fun <T: View> Fragment.bindView(@IdRes id: Int): Lazy<T> {
    @Suppress("UNCHECKED_CAST")
    return lazy(LazyThreadSafetyMode.NONE) { view?.findViewById(id) as T }
}

inline fun <T> Fragment.argument(key: String): Lazy<T> {
    return lazy(LazyThreadSafetyMode.NONE) {
        @Suppress("UNCHECKED_CAST")
        arguments.get(key) as T
    }
}

inline fun <T> Fragment.argumentOrNull(key: String): Lazy<T?> {
    return lazy(LazyThreadSafetyMode.NONE) {
        @Suppress("UNCHECKED_CAST")
        arguments.get(key) as? T?
    }
}
