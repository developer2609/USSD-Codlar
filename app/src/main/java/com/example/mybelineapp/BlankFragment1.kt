package com.example.mybelineapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.mybelineapp.databinding.FragmentBlank1Binding

class BlankFragment1 : Fragment() {
    private lateinit var binding: FragmentBlank1Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
          binding=FragmentBlank1Binding.inflate(layoutInflater)
          binding.apply {
              card1.setOnClickListener {
                  findNavController().navigate(R.id.homeFragment2, bundleOf("key" to 0))
              }
              card2.setOnClickListener {
                  findNavController().navigate(R.id.homeFragment2, bundleOf("key" to 1))
              }
              card3.setOnClickListener {
                  findNavController().navigate(R.id.homeFragment2, bundleOf("key" to 2))
              }
              card4.setOnClickListener {
                  findNavController().navigate(R.id.homeFragment2, bundleOf("key" to 3))
              }
          }

        return  binding.root
    }


}