@file:Suppress("NOTHING_TO_INLINE", "unused")

package com.commit451.addendum

import android.support.annotation.IdRes
import android.support.annotation.Px
import android.view.View
import android.view.ViewGroup

const val SENTINEL_NO_MARGIN_GIVEN = Int.MAX_VALUE - 6

inline fun View.setHeight(height: Int) {
    val params = layoutParams
    params.height = height
    layoutParams = params
}

inline fun View.setWidth(width: Int) {
    val params = layoutParams
    params.width = width
    layoutParams = params
}

inline fun <T : View> View.bindView(@IdRes id: Int): Lazy<T> {
    @Suppress("UNCHECKED_CAST")
    return lazy(LazyThreadSafetyMode.NONE) { findViewById<T>(id) }
}

inline fun View.updateMargins(@Px left: Int = SENTINEL_NO_MARGIN_GIVEN,
                        @Px top: Int = SENTINEL_NO_MARGIN_GIVEN,
                        @Px right: Int = SENTINEL_NO_MARGIN_GIVEN,
                        @Px bottom: Int = SENTINEL_NO_MARGIN_GIVEN) {
    val params = layoutParams as ViewGroup.MarginLayoutParams
    val finalLeftMargin = if (left == SENTINEL_NO_MARGIN_GIVEN) params.leftMargin else left
    val finalTopMargin = if (top == SENTINEL_NO_MARGIN_GIVEN) params.topMargin else top
    val finalRightMargin = if (right == SENTINEL_NO_MARGIN_GIVEN) params.rightMargin else right
    val finalBottomMargin = if (bottom == SENTINEL_NO_MARGIN_GIVEN) params.bottomMargin else bottom
    params.setMargins(finalLeftMargin, finalTopMargin, finalRightMargin, finalBottomMargin)
}
