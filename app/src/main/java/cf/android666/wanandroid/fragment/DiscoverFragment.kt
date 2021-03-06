package cf.android666.wanandroid.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import cf.android666.wanandroid.R
import cf.android666.wanandroid.adapter.MFragmentViewPagerAdapter
import cf.android666.wanandroid.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_discover.view.*

/**
 * Created by jixiaoyong on 2018/2/25.
 */
class DiscoverFragment : BaseFragment() {

    override var layoutId = R.layout.fragment_discover

    override fun onCreateViewState(savedInstanceState: Bundle?) {

        val fragments = arrayListOf<BaseFragment>()

        fragments.add(DiscoverTreeFragment())
        fragments.add(DiscoverProjectsFragment())
        fragments.add(DiscoverNaviFragment())

        mView!!.viewpager.adapter = MFragmentViewPagerAdapter(childFragmentManager, fragments)

        var tablayout = mView!!.tab_layout

        //设置该方法后会删除tab标题，因此在后面手动加上
        tablayout.setupWithViewPager(mView!!.viewpager)
        tablayout.getTabAt(0)!!.text = "体系"
        tablayout.getTabAt(1)!!.text = "项目"
        tablayout.getTabAt(2)!!.text = "导航"
    }
}