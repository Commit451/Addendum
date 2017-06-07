package com.commit451.addendum.design

import android.support.design.widget.Snackbar
import android.widget.TextView


fun Snackbar.maxLines(lines: Int): Snackbar {
    (view.findViewById(android.support.design.R.id.snackbar_text) as TextView).maxLines = lines
    return this
}
