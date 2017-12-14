@file:Suppress("NOTHING_TO_INLINE")

package com.commit451.addendum

import android.support.annotation.IdRes
import android.support.annotation.Px
import android.view.View
import android.view.ViewGroup
import android.view.ViewTreeObserver

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

inline fun View.visible() {
    visibility = View.VISIBLE
}

inline fun View.invisible() {
    visibility = View.INVISIBLE
}

inline fun View.gone() {
    visibility = View.GONE
}

inline fun View.isVisible(): Boolean = visibility == View.VISIBLE

inline fun View.isGone(): Boolean = visibility == View.GONE

inline fun View.isInvisible(): Boolean = visibility == View.INVISIBLE

inline fun <T : View> View.bindView(@IdRes id: Int): Lazy<T> {
    @Suppress("UNCHECKED_CAST")
    return lazy(LazyThreadSafetyMode.NONE) { findViewById<T>(id) }
}

inline fun View.padding(@Px leftPadding: Int = paddingLeft,
                        @Px topPadding: Int = paddingTop,
                        @Px rightPadding: Int = paddingRight,
                        @Px bottomPadding: Int = paddingBottom) {
    setPadding(leftPadding, topPadding, rightPadding, bottomPadding)
}

inline fun View.margins(@Px leftMargin: Int = SENTINEL_NO_MARGIN_GIVEN,
                        @Px topMargin: Int = SENTINEL_NO_MARGIN_GIVEN,
                        @Px rightMargin: Int = SENTINEL_NO_MARGIN_GIVEN,
                        @Px bottomMargin: Int = SENTINEL_NO_MARGIN_GIVEN) {
    val params = layoutParams as ViewGroup.MarginLayoutParams
    val finalLeftMargin = if (leftMargin == SENTINEL_NO_MARGIN_GIVEN) params.leftMargin else leftMargin
    val finalTopMargin = if (topMargin == SENTINEL_NO_MARGIN_GIVEN) params.topMargin else topMargin
    val finalRightMargin = if (rightMargin == SENTINEL_NO_MARGIN_GIVEN) params.rightMargin else rightMargin
    val finalBottomMargin = if (bottomMargin == SENTINEL_NO_MARGIN_GIVEN) params.bottomMargin else bottomMargin
    params.setMargins(finalLeftMargin, finalTopMargin, finalRightMargin, finalBottomMargin)
}

inline fun View.onPreDraw(crossinline block: () -> Unit, draw: Boolean = true) {
    viewTreeObserver.addOnPreDrawListener(object : ViewTreeObserver.OnPreDrawListener {
        override fun onPreDraw(): Boolean {
            viewTreeObserver.removeOnPreDrawListener(this)
            block.invoke()
            return draw
        }
    })
}

inline fun View.onGlobalLayout(crossinline block: () -> Unit) {
    viewTreeObserver.addOnGlobalLayoutListener(object : ViewTreeObserver.OnGlobalLayoutListener {
        override fun onGlobalLayout() {
            viewTreeObserver.removeOnGlobalLayoutListener(this)
            block.invoke()
        }
    })
}
