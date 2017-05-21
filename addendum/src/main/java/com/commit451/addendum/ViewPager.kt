package com.commit451.addendum

import android.support.v4.view.ViewPager

fun ViewPager.back(animate: Boolean = true) {
    setCurrentItem(currentItem - 1, animate)
}

fun ViewPager.forward(animate: Boolean = true) {
    setCurrentItem(currentItem + 1, animate)
}

fun ViewPager.isOnLastPage(): Boolean {
    return currentItem == adapter.count - 1
}

fun ViewPager.isOnFirstPage(): Boolean {
    return currentItem == 0
}