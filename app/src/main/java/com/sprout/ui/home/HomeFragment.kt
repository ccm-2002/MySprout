package com.sprout.ui.home

import androidx.fragment.app.Fragment
import com.shop.base.BaseFragment
import com.sprout.R
import com.sprout.databinding.FragmentHomeBinding
import com.sprout.viewmodel.home.HomeViewModel
import kotlinx.android.synthetic.main.activity_sprout.view.*

class HomeFragment : BaseFragment<HomeViewModel, FragmentHomeBinding>(R.layout.fragment_home,HomeViewModel::class.java) {

    //采用伴生对象 companion object==static
    companion object{
        val instance : HomeFragment by lazy { HomeFragment() }
    }

    override fun initView() {
        TODO("Not yet implemented")
    }

    override fun initVM() {
        TODO("Not yet implemented")
    }

    override fun initData() {
        TODO("Not yet implemented")
    }

    override fun initVariable() {
        TODO("Not yet implemented")
    }


}