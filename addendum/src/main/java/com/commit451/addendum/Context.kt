package com.commit451.addendum

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.support.annotation.ColorInt
import android.support.annotation.ColorRes
import android.support.v4.content.ContextCompat


@ColorInt
fun Context.color(@ColorRes color: Int) : Int {
    return ContextCompat.getColor(this, color)
}

fun Context.copyToClipboard(label: String, text: String) {
    val clipboard = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
    val clip = ClipData.newPlainText(label, text)
    clipboard.primaryClip = clip
}