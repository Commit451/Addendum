package com.commit451.addendum


import android.support.annotation.IdRes
import android.support.v4.app.Fragment
import android.view.View

fun <T: View> Fragment.bindView(@IdRes id: Int): Lazy<T> {
    @Suppress("UNCHECKED_CAST")
    return lazy(LazyThreadSafetyMode.NONE) { view?.findViewById(id) as T }
}
