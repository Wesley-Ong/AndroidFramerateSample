package com.grindr.android.framerate.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.grindr.android.framerate.R
import com.grindr.android.framerate.ui.MyBaseFragment

class LottieSampleFragment : MyBaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_lottie, container, false)
    }
}