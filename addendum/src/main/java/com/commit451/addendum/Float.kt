package com.commit451.addendum

import android.content.Context

fun Float.dp(context: Context): Float {
    return this * context.resources.displayMetrics.density
}