package com.sprout.ui.home.recommend

import androidx.fragment.app.Fragment
import com.sprout.ui.home.HomeFragment

class RecommendFragment : Fragment() {

    //采用伴生对象 companion object==static
    companion object{
        val instance : RecommendFragment by lazy { RecommendFragment() }
    }

}