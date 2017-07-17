package com.commit451.addendum.recyclerview

import android.content.Context
import android.content.res.Resources
import android.support.annotation.IdRes
import android.support.v7.widget.RecyclerView
import android.view.View

inline val RecyclerView.ViewHolder.context: Context
    get() = itemView.context

inline val RecyclerView.ViewHolder.resources: Resources
    get() = itemView.context.resources

fun <T : View> RecyclerView.ViewHolder.bindView(@IdRes id: Int): Lazy<T> {
    @Suppress("UNCHECKED_CAST")
    return lazy(LazyThreadSafetyMode.NONE) { itemView.findViewById(id) as T }
}
