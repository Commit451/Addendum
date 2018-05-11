@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.commit451.addendum

import android.os.Build
import android.text.Html
import android.text.Spanned

/**
 * Assures HTML is formatted the same way pre and post Android N
 */
@Suppress("DEPRECATION")
inline fun String.htmlToSpanned(): Spanned {
    return if (Build.VERSION.SDK_INT >= 24) {
        Html.fromHtml(this, Html.FROM_HTML_MODE_LEGACY)
    } else {
        Html.fromHtml(this)
    }
}

