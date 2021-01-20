package com.sprout.ui.more

import androidx.fragment.app.Fragment
import com.sprout.ui.discover.DiscoverFragment

class MoreFragment : Fragment() {

    //采用伴生对象 companion object==static
    companion object{
        val instance : MoreFragment by lazy { MoreFragment() }
    }

}