package com.sprout.viewmodel.home

import androidx.fragment.app.Fragment
import com.sprout.base.BaseViewModel
import com.sprout.net.Injection
import com.sprout.ui.home.attention.AttentionFragment
import com.sprout.ui.home.city.CityFragment
import com.sprout.ui.home.recommend.RecommendFragment

class HomeViewModel : BaseViewModel(Injection.repository) {

    var fragments:MutableList<Fragment> = mutableListOf()

    //添加进入集合
    init {
        fragments.add(CityFragment.instance)
        fragments.add(AttentionFragment.instance)
        fragments.add(RecommendFragment.instance)
    }

}