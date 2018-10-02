@file:Suppress("NOTHING_TO_INLINE", "unused")

package com.commit451.addendum

import androidx.viewpager.widget.ViewPager

inline fun ViewPager.back(animate: Boolean = true) {
    setCurrentItem(currentItem - 1, animate)
}

inline fun ViewPager.forward(animate: Boolean = true) {
    setCurrentItem(currentItem + 1, animate)
}

inline fun ViewPager.isOnLastPage(): Boolean {
    return currentItem == (adapter?.count ?: 0) - 1
}

inline fun ViewPager.isOnFirstPage(): Boolean {
    return currentItem == 0
}