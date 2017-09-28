package com.commit451.addendum

import android.content.Context

fun Int.dp(context: Context): Int = this.toFloat().dp(context).toInt()