package com.commit451.addendum

import android.os.Build
import android.text.Html
import android.text.Spanned

/**
 * Assures HTML is formatted the same way pre and post Android N
 */
@Suppress("DEPRECATION")
fun String.htmlToSpanned(): Spanned {
    if (Build.VERSION.SDK_INT >= 24) {
        return Html.fromHtml(this, Html.FROM_HTML_MODE_LEGACY)
    } else {
        return Html.fromHtml(this)
    }
}

