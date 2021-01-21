package com.sprout.ui.home


import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

import androidx.fragment.app.FragmentStatePagerAdapter
import com.sprout.R
import com.sprout.base.BaseFragment
import com.sprout.databinding.FragmentHomeBinding
import com.sprout.viewmodel.home.HomeViewModel
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : BaseFragment<HomeViewModel, FragmentHomeBinding>(R.layout.fragment_home,HomeViewModel::class.java) {


    var pagerAdapter : ViewPage ?=null

    //采用伴生对象 companion object==static
    companion object{
        val instance : HomeFragment by lazy { HomeFragment() }
    }

    override fun initView() {
        //设置适配器
        //pagerAdapter = ViewPage(childFragmentManager,mViewModel.fragments)

        //绑定适配器
        home_viewpager.adapter = pagerAdapter
        //设置ViewPager监听
        //home_viewpager.addOnPageChangeListener(MyPagerChangeListener())



    }

    override fun initVM() {

    }

    override fun initData() {

    }

    override fun initVariable() {

    }

    //TODO  viewpager适配器
    class ViewPage(supportFragmentManager: FragmentManager, val list: List<Fragment>, var mNames: Array<String>):
        FragmentStatePagerAdapter(supportFragmentManager) {
        override fun getCount(): Int {
            return list.size
        }

        override fun getItem(position: Int): Fragment {
            return list.get(position)
        }

        override fun getPageTitle(position: Int): CharSequence? {
            return mNames[position]
        }
    }


}