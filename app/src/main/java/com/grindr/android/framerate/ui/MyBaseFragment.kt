package com.grindr.android.framerate.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.grindr.android.framerate.tracer.registerTracer

/**
 * Got called when fragment visibility changed.
 */
interface OnHiddenChangedListener {
    fun onHidden(hidden: Boolean)
}

abstract class MyBaseFragment : Fragment() {
    private val visibilityChangedListeners = ArrayList<OnHiddenChangedListener>()

    override fun onHiddenChanged(hidden: Boolean) {
        super.onHiddenChanged(hidden)
        visibilityChangedListeners.forEach { it.onHidden(hidden) }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        registerTracer()
    }

    override fun onDestroy() {
        super.onDestroy()
        visibilityChangedListeners.clear()
    }

    fun addOnHiddenChangedListener(l: OnHiddenChangedListener) {
        visibilityChangedListeners.add(l)
    }

    fun removeOnHiddenChangedListener(l: OnHiddenChangedListener) {
        visibilityChangedListeners.remove(l)
    }
}