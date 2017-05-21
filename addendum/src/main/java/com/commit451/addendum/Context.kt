package com.commit451.addendum

import android.content.Context
import android.support.annotation.ColorInt
import android.support.annotation.ColorRes
import android.support.v4.content.ContextCompat


@ColorInt
fun Context.color(@ColorRes color: Int) : Int {
    return ContextCompat.getColor(this, color)
}
