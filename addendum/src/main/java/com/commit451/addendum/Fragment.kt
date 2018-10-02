@file:Suppress("NOTHING_TO_INLINE", "unused")

package com.commit451.addendum


import android.view.View
import androidx.annotation.IdRes
import androidx.fragment.app.Fragment

inline fun <T: View> Fragment.bindView(@IdRes id: Int): Lazy<T> {
    @Suppress("UNCHECKED_CAST")
    return lazy(LazyThreadSafetyMode.NONE) { view!!.findViewById<T>(id) }
}

inline fun <T> Fragment.argument(key: String): Lazy<T> {
    return lazy(LazyThreadSafetyMode.NONE) {
        @Suppress("UNCHECKED_CAST")
        arguments!!.get(key) as T
    }
}

inline fun <T> Fragment.argumentOrNull(key: String): Lazy<T?> {
    return lazy(LazyThreadSafetyMode.NONE) {
        @Suppress("UNCHECKED_CAST")
        arguments?.get(key) as? T?
    }
}

/**
 * Cast the parent fragment or context to the fragment, allowing you to get a reference
 * to the parent as the type you need. Call this within [Fragment.onAttach]
 */
inline fun <reified T> Fragment.bindHost(): T {
    if (parentFragment != null) {
        if (parentFragment is T) {
            return parentFragment as T
        }
    }
    if (context is T) {
        return context as T
    }
    throw IllegalStateException(this.javaClass.simpleName + " must be attached to a parent that implements the class passed in onAttach")
}
