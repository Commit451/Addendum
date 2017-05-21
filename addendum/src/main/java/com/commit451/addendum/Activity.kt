package com.commit451.addendum

import android.annotation.TargetApi
import android.app.Activity
import android.graphics.Point
import android.view.View
import android.view.WindowManager


@TargetApi(16)
fun Activity.flagFullscreen() {
    window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
}

fun Activity.screenHeight(): Int {
    val display = windowManager.defaultDisplay
    val size = Point()
    display.getSize(size)
    return size.y
}

fun Activity.screenWidth(): Int {
    val display = windowManager.defaultDisplay
    val size = Point()
    display.getSize(size)
    return size.x
}

/**
 * Call this before setContentView
 */
fun Activity.maxBrightness() {
    val params = window.attributes
    params.screenBrightness = 1f // range from 0 - 1 as per docs
    window.attributes = params
    window.addFlags(WindowManager.LayoutParams.FLAGS_CHANGED)
}
