package com.sprout.ui.home.attention

import androidx.fragment.app.Fragment
import com.sprout.ui.home.HomeFragment

class AttentionFragment : Fragment() {

    //采用伴生对象 companion object==static
    companion object{
        val instance : AttentionFragment by lazy { AttentionFragment() }
    }

}