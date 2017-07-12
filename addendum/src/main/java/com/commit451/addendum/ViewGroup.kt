package com.commit451.addendum

import android.view.View
import android.view.ViewGroup

//https://youtu.be/fPzxfeDJDzY?t=314

inline fun ViewGroup.forEach(action: (View) -> Unit) {
    for (index in 0 until childCount) {
        action(getChildAt(index))
    }
}

inline fun ViewGroup.forEachIndexed(action: (Int, View) -> Unit) {
    for (index in 0 until childCount) {
        action(index, getChildAt(index))
    }
}