package com.grindr.android.framerate.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.grindr.android.framerate.R
import com.grindr.android.framerate.ui.MyBaseFragment
import kotlinx.android.synthetic.main.fragment_home.*

class GifSampleFragment : MyBaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Glide.with(this)
            .load(R.raw.sample_gif)
            .into(ivGif)
    }
}