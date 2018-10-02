@file:Suppress("NOTHING_TO_INLINE", "unused")

package com.commit451.addendum

import android.app.Dialog
import android.view.View
import androidx.annotation.IdRes

inline fun <T : View> Dialog.bindView(@IdRes id: Int): Lazy<T> {
    @Suppress("UNCHECKED_CAST")
    return lazy(LazyThreadSafetyMode.NONE) { findViewById<T>(id) }
}