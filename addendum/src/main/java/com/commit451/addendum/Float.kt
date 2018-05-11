@file:Suppress("NOTHING_TO_INLINE")

package com.commit451.addendum

import android.content.Context

inline fun Float.dp(context: Context): Float {
    return this * context.resources.displayMetrics.density
}