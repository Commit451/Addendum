package com.commit451.addendum

import android.content.Context

object Addendum {

    private var xdpi = java.lang.Float.MIN_VALUE

    internal fun xdpi(context: Context): Float {
        if (xdpi == java.lang.Float.MIN_VALUE) {
            xdpi = context.resources.displayMetrics.xdpi
        }
        return xdpi
    }
}