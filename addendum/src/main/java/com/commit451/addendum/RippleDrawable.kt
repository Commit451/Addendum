@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.commit451.addendum

import android.graphics.drawable.RippleDrawable
import android.os.Handler

/**
 * Force the drawable to show the ripple animation for the given duration
 */
inline fun RippleDrawable.forceAnimation(timeInMs: Long = 200) {
    state = intArrayOf(android.R.attr.state_pressed, android.R.attr.state_enabled)
    val handler = Handler()
    handler.postDelayed({ state = intArrayOf() }, timeInMs)
}
