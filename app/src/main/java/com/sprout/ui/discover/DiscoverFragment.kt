package com.sprout.ui.discover

import androidx.fragment.app.Fragment

class DiscoverFragment : Fragment() {

    //采用伴生对象 companion object==static
    companion object{
        val instance : DiscoverFragment by lazy { DiscoverFragment() }
    }

}