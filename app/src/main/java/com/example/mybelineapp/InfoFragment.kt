package com.example.mybelineapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mybelineapp.Myinfo.Myinfo
import com.example.mybelineapp.databinding.FragmentInfoBinding

class InfoFragment : Fragment() {
   private lateinit var binding: FragmentInfoBinding
   lateinit var myinfo: Myinfo

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
      binding=FragmentInfoBinding.inflate(layoutInflater)
        myinfo=arguments?.getSerializable("keyInfo",)as Myinfo
binding.tvInfo.text=myinfo.name

        return  binding.root
    }


}