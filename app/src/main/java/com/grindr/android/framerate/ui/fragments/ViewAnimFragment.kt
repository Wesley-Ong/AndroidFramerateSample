package com.grindr.android.framerate.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.grindr.android.framerate.R
import com.grindr.android.framerate.ui.MyBaseFragment
import kotlinx.android.synthetic.main.fragment_notifications.*

class ViewAnimFragment : MyBaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_notifications, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ivSampleView.animate()
            .translationY(150f)
            .scaleY(2f)
            .scaleX(2f)
            .duration = 1000L
    }
}