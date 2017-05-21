package com.commit451.addendum.recyclerview

import android.content.Context
import android.content.res.Resources
import android.support.v7.widget.RecyclerView

fun RecyclerView.ViewHolder.resources(): Resources {
    return itemView.context.resources
}

fun RecyclerView.ViewHolder.context(): Context {
    return itemView.context
}