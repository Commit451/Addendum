@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.commit451.addendum.recyclerview

import android.content.Context
import android.content.res.Resources
import android.view.View
import androidx.annotation.IdRes
import androidx.recyclerview.widget.RecyclerView

inline val RecyclerView.ViewHolder.context: Context
    get() = itemView.context

inline val RecyclerView.ViewHolder.resources: Resources
    get() = itemView.context.resources

inline fun <T : View> RecyclerView.ViewHolder.bindView(@IdRes id: Int): Lazy<T> {
    @Suppress("UNCHECKED_CAST")
    return lazy(LazyThreadSafetyMode.NONE) { itemView.findViewById<T>(id) }
}
