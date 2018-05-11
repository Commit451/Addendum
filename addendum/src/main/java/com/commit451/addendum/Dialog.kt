@file:Suppress("NOTHING_TO_INLINE", "unused")

package com.commit451.addendum

import android.app.Dialog
import android.support.annotation.IdRes
import android.view.View

inline fun <T : View> Dialog.bindView(@IdRes id: Int): Lazy<T> {
    @Suppress("UNCHECKED_CAST")
    return lazy(LazyThreadSafetyMode.NONE) { findViewById<T>(id) }
}