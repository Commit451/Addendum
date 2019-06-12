@file:Suppress("NOTHING_TO_INLINE", "unused")

package com.commit451.addendum.design

import android.view.View
import androidx.annotation.StringRes
import com.google.android.material.snackbar.Snackbar


inline fun View.snackbar(@StringRes resId: Int, length: Int = Snackbar.LENGTH_SHORT, shouldShow: Boolean = true): Snackbar {
    return snackbar(resources.getText(resId), length, shouldShow)
}

inline fun View.snackbar(text: CharSequence, length: Int = Snackbar.LENGTH_SHORT, shouldShow: Boolean = true): Snackbar {
    val snackbar = Snackbar.make(this, text, length)
    if (shouldShow) {
        snackbar.show()
    }
    return snackbar
}
