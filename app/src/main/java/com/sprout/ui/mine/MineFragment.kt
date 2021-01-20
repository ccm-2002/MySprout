package com.sprout.ui.mine

import androidx.fragment.app.Fragment
import com.sprout.ui.message.MessageFragment

class MineFragment : Fragment() {

    //采用伴生对象 companion object==static
    companion object{
        val instance : MineFragment by lazy { MineFragment() }
    }

}