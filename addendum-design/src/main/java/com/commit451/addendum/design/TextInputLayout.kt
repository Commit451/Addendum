@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.commit451.addendum.design

import android.support.design.widget.TextInputLayout

/**
 * Validates if the [TextInputLayout.getEditText] is null or empty, and sets the error message to the
 * given message if so
 */
inline fun TextInputLayout.validateNotEmpty(errorMessage: String): Boolean {
    if (editText!!.text.isNullOrEmpty()) {
        error = errorMessage
        return false
    } else {
        error = null
        return true
    }
}

/**
 * Retrieves the text from the TextInputLayout's EditText
 */
inline fun TextInputLayout.text(): String {
    return editText!!.text.toString()
}