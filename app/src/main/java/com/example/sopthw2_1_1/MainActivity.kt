package com.example.sopthw2_1_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_home.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //rv_home을 가로선으로 나눈다. itemDecoration을 사용한다.
//        rv_home.addItemDecoration(DividerItemDecoration(this, LinearLayoutManager.HORIZONTAL))

        main_viewPager.adapter = MainPagerAdapter(supportFragmentManager)
        main_viewPager.offscreenPageLimit = 2
        main_viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {

            }

            override fun onPageScrolled(
                    position: Int,
                    positionOffset: Float,
                    positionOffsetPixels: Int
            ) {
            }

            override fun onPageSelected(position: Int) {
                //네비게이션 메뉴 아이템 체크
                bottomNavigationView.menu.getItem(position).isChecked = true
            }

        })

        bottomNavigationView.setOnNavigationItemSelectedListener{
            when (it.itemId) {
                R.id.menu_home -> main_viewPager.currentItem = 0
                R.id.menu_book -> main_viewPager.currentItem = 1
                R.id.menu_person -> main_viewPager.currentItem = 2
            }
            true
        }

    }
}
