package com.sprout.ui.message

import androidx.fragment.app.Fragment
import com.sprout.ui.more.MoreFragment

class MessageFragment : Fragment() {

    //采用伴生对象 companion object==static
    companion object{
        val instance : MessageFragment by lazy { MessageFragment() }
    }

}