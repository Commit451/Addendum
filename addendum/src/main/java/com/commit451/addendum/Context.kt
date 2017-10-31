package com.commit451.addendum

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.support.annotation.AttrRes
import android.support.annotation.ColorInt
import android.support.annotation.ColorRes
import android.support.v4.content.ContextCompat
import android.util.TypedValue


@ColorInt
inline fun Context.color(@ColorRes color: Int) : Int {
    return ContextCompat.getColor(this, color)
}

inline fun Context.copyToClipboard(label: String, text: String) {
    val clipboard = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
    val clip = ClipData.newPlainText(label, text)
    clipboard.primaryClip = clip
}

/**
 * Get a color from the attribute theme
 *
 * @param attributeColor the attribute color, ex R.attr.colorPrimary
 * @return the color, or [Color.TRANSPARENT] if failed to resolve
 */
@ColorInt
inline fun Context.themeAttrColor(@AttrRes attributeColor: Int): Int {
    val attrs = intArrayOf(attributeColor)
    val ta = obtainStyledAttributes(attrs)
    val color = ta.getColor(0, Color.TRANSPARENT)
    ta.recycle()
    return color
}

/**
 * Get a drawable from the attribute theme
 *
 * @param attributeDrawable the attribute drawable, ex R.attr.selectableItemBackground
 * @return the drawable, if it exists in the theme context
 */
inline fun Context.themeAttrDrawable(@AttrRes attributeDrawable: Int): Drawable? {
    val attrs = intArrayOf(attributeDrawable)
    val ta = obtainStyledAttributes(attrs)
    val drawableFromTheme = ta.getDrawable(0)
    ta.recycle()
    return drawableFromTheme
}

/**
 * Get a dimen from the attribute theme
 *
 * @param attributeDimen the attribute dimen, ex R.attr.actionBarSize
 * @return the dimen pixel size, if it exists in the theme context. Otherwise, -1
 */
inline fun Context.themeAttrDimen(@AttrRes attributeDimen: Int): Float {
    val tv = TypedValue()

    var value = -1
    if (theme.resolveAttribute(attributeDimen, tv, true)) {
        value = TypedValue.complexToDimensionPixelSize(tv.data, resources.displayMetrics)
    }
    return value.toFloat()
}