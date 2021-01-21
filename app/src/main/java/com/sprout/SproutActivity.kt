package com.sprout

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.sprout.base.BaseActivity
import com.sprout.databinding.ActivitySproutBinding
import com.sprout.ui.discover.DiscoverFragment
import com.sprout.ui.home.HomeFragment
import com.sprout.ui.message.MessageFragment
import com.sprout.ui.mine.MineFragment
import com.sprout.ui.more.MoreFragment
import com.sprout.viewmodel.SproutViewModel

class SproutActivity : BaseActivity<SproutViewModel, ActivitySproutBinding>
    (R.layout.activity_sprout,SproutViewModel::class.java),View.OnClickListener{

    lateinit var homeFragment: Fragment
    lateinit var discoverFragment: Fragment
    lateinit var moreFragment: Fragment
    lateinit var messageFragment: Fragment
    lateinit var mineFragment: Fragment

    lateinit var transaction : FragmentTransaction

    override fun initView() {

        homeFragment = HomeFragment.instance
        discoverFragment = DiscoverFragment.instance
        moreFragment = MoreFragment.instance
        messageFragment = MessageFragment.instance
        mineFragment = MineFragment.instance

        //初始化第一个Fragment
        transaction = supportFragmentManager.beginTransaction()

        mDataBinding.layoutHome.setOnClickListener(this)
        mDataBinding.layoutDiscover.setOnClickListener(this)
        mDataBinding.layoutMore.setOnClickListener(this)
        mDataBinding.layoutMessage.setOnClickListener(this)
        mDataBinding.layoutMine.setOnClickListener(this)
    }

    override fun initVM() {

    }

    override fun initData() {

    }

    override fun initVariable() {

    }

    override fun onClick(v: View?) {
        resetImg()
        when(v!!.id){
            R.id.layout_home ->{
                mDataBinding.imgHome.setImageResource(R.mipmap.main_nav_home_is)
                transaction.replace(R.id.fragments,homeFragment)
                //

            }
            R.id.layout_discover ->{
                mDataBinding.imgDiscover.setImageResource(R.mipmap.main_nav_discover_is)
                transaction.replace(R.id.fragments,discoverFragment)
               // transaction.commit()
            }
            R.id.layout_more ->{

            }
            R.id.layout_message ->{
                mDataBinding.imgMessage.setImageResource(R.mipmap.main_nav_message_is)
                transaction.replace(R.id.fragments,messageFragment)
                //transaction.commit()
            }
            R.id.layout_mine ->{
                mDataBinding.imgMine.setImageResource(R.mipmap.main_nav_mine_is)
                transaction.replace(R.id.fragments,mineFragment)
                //transaction.commit()
            }
        }
    }

    private fun resetImg(){
        mDataBinding.imgHome.setImageResource(R.mipmap.main_nav_home_not)
        mDataBinding.imgDiscover.setImageResource(R.mipmap.main_nav_discover_not)
        //mDataBinding.imgHome.setImageResource(R.mipmap.main_nav_more)
        mDataBinding.imgMessage.setImageResource(R.mipmap.main_nav_message_not)
        mDataBinding.imgMine.setImageResource(R.mipmap.main_nav_mine_not)
    }

}