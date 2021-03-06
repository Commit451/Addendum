@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.commit451.addendum

import android.content.res.AssetManager
import java.nio.charset.Charset

inline fun AssetManager.openAsString(fileName: String): String {
    val `is` = open(fileName)
    val size = `is`.available()
    val buffer = ByteArray(size)
    `is`.read(buffer)
    `is`.close()
    return String(buffer, Charset.forName("UTF-8"))
}