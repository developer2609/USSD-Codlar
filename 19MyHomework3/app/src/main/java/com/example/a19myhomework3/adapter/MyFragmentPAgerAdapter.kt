package com.example.a19myhomework3.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.a19myhomework3.fragment.BlankFragment
import com.example.a19myhomework3.models.User

class MyFragmentPAgerAdapter(fm:FragmentManager,val list: List<User>):FragmentPagerAdapter(fm) {
    override fun getCount(): Int =list.size

    override fun getItem(position: Int): Fragment {
          return  BlankFragment.newInstance(list[position])


    }
}