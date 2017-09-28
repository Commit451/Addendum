package com.commit451.addendum

import android.content.Context
import android.util.DisplayMetrics

fun Float.dp(context: Context): Float {
    return this * (Addendum.xdpi(context) / DisplayMetrics.DENSITY_DEFAULT)
}