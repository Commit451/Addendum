package com.commit451.addendum

import android.webkit.WebView


fun WebView.loadHtml(text: String) {
    loadData(text, "text/html", "UTF-8")
}
