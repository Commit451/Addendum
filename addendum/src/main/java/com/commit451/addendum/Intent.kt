package com.commit451.addendum

import android.content.Intent


/**
 * Standard [Intent.getIntExtra] but allows for null. Note that this would treat [Int.MIN_VALUE]
 * as null if you were to pass it
 */
fun Intent.getIntExtra(name: String): Int? {
    val value = getIntExtra(name, Int.MIN_VALUE)
    if (value == Int.MIN_VALUE) {
        return null
    }
    return value
}
