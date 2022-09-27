package com.example.a19myhomework3.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.a19myhomework3.R
import com.example.a19myhomework3.databinding.ActivityMainBinding
import com.example.a19myhomework3.databinding.FragmentBlankBinding
import com.example.a19myhomework3.models.User

private const val ITEM="user"
private lateinit var binding:FragmentBlankBinding

class BlankFragment : Fragment() {
     private  var user: User?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        user=it.getSerializable(ITEM)as User

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
     binding=FragmentBlankBinding.inflate(layoutInflater)
              binding.apply {

            text1.text=user?.text1
                  image.setImageResource(user!!.image.toInt())

              }
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance(user:  User) =
            BlankFragment().apply {
                arguments = Bundle().apply {
               putSerializable(ITEM,user)


                }
            }
    }
}