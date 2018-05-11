@file:Suppress("NOTHING_TO_INLINE")

package com.commit451.addendum

import android.content.Context

inline fun Int.dp(context: Context): Int = this.toFloat().dp(context).toInt()