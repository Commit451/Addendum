@file:Suppress("NOTHING_TO_INLINE")

package com.commit451.addendum.design

import android.annotation.SuppressLint
import android.support.design.internal.BottomNavigationItemView
import android.support.design.internal.BottomNavigationMenuView
import android.support.design.widget.BottomNavigationView


/**
 * Disables the shifting mode of [BottomNavigationView]. This uses reflection, so beware
 */
@SuppressLint("RestrictedApi")
inline fun BottomNavigationView.disableShiftingMode() {
    val menuView = getChildAt(0) as BottomNavigationMenuView
    val shiftingMode = menuView.javaClass.getDeclaredField("mShiftingMode")
    shiftingMode.isAccessible = true
    shiftingMode.setBoolean(menuView, false)
    shiftingMode.isAccessible = false
    for (i in 0 until menuView.childCount) {
        val item = menuView.getChildAt(i) as BottomNavigationItemView

        item.setShiftingMode(false)
        // set once again checked value, so view will be updated

        item.setChecked(item.itemData.isChecked)
    }
}