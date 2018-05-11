@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.commit451.addendum.design

import android.support.design.widget.Snackbar
import android.widget.TextView


inline fun Snackbar.maxLines(lines: Int): Snackbar {
    view.findViewById<TextView>(android.support.design.R.id.snackbar_text).maxLines = lines
    return this
}
