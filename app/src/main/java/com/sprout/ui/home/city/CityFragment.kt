package com.sprout.ui.home.city

import androidx.fragment.app.Fragment
import com.sprout.ui.home.HomeFragment

class CityFragment : Fragment() {

    //采用伴生对象 companion object==static
    companion object{
        val instance : CityFragment by lazy { CityFragment() }
    }

}