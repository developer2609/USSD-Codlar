package com.example.mybelineapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.mybelineapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    lateinit var binding: FragmentHomeBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

   binding=FragmentHomeBinding.inflate(layoutInflater)

        binding.apply {
          image1.setOnClickListener {
          findNavController().navigate(R.id.blankFragment, bundleOf("key" to 0))
          }
        }

        binding.apply {
            image2.setOnClickListener {
                findNavController().navigate(R.id.blankFragment, bundleOf("key" to 1))
            }
        }
        binding.apply {
            image3.setOnClickListener {
                findNavController().navigate(R.id.blankFragment, bundleOf("key" to 2))
            }
        }
        binding.apply {
            image4.setOnClickListener {
                findNavController().navigate(R.id.blankFragment, bundleOf("key" to 3))
            }
        }
        binding.apply {
            image5.setOnClickListener {
                findNavController().navigate(R.id.blankFragment, bundleOf("key" to 4))
            }
        }

        binding.apply {
            image6.setOnClickListener {
                findNavController().navigate(R.id.blankFragment, bundleOf("key" to 5))
            }
        }


        return binding.root
    }


}