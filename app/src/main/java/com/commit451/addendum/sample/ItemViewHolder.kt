package com.commit451.addendum.sample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.commit451.addendum.recyclerview.bindView
import com.commit451.addendum.recyclerview.resources

class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


    companion object {

        fun inflate(parent: ViewGroup): ItemViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
            return ItemViewHolder(view)
        }
    }

    private val textView by bindView<TextView>(R.id.text)

    fun bind(text: String?) {
        val message = text ?: resources.getString(R.string.app_name)
        textView.text = message
    }

}