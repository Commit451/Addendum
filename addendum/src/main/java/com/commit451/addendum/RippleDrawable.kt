package com.commit451.addendum

import android.graphics.drawable.RippleDrawable
import android.os.Handler

fun RippleDrawable.forceAnimation(timeInMs: Long = 200) {
    state = intArrayOf(android.R.attr.state_pressed, android.R.attr.state_enabled)
    val handler = Handler()
    handler.postDelayed({ state = intArrayOf() }, timeInMs)
}
