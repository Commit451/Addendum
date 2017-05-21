package com.commit451.addendum.design

import android.support.design.widget.TextInputLayout

fun TextInputLayout.validate(errorMessage: String): Boolean {
    if (editText!!.text.isNullOrEmpty()) {
        error = errorMessage
        return false
    } else {
        error = null
        return true
    }
}

fun TextInputLayout.text(): String {
    return editText!!.text.toString()
}