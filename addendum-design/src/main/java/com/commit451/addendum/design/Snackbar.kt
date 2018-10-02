@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.commit451.addendum.design

import android.widget.TextView
import com.google.android.material.snackbar.Snackbar


inline fun Snackbar.maxLines(lines: Int): Snackbar {
    view.findViewById<TextView>(R.id.snackbar_text).maxLines = lines
    return this
}
