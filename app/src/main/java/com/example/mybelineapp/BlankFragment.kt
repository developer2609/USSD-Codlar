package com.example.mybelineapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.mybelineapp.Myinfo.Myinfo
import com.example.mybelineapp.adapter.Rvadapter
import com.example.mybelineapp.databinding.FragmentBlankBinding
import com.example.mybelineapp.utils.MyDate

class BlankFragment : Fragment(), Rvadapter.RvClick {

    private lateinit var binding: FragmentBlankBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        binding=FragmentBlankBinding.inflate(layoutInflater)

          val str=arguments?.getInt("key",0)

        when(str){
         0->{
           binding.rv.adapter=Rvadapter(MyDate.listTarif,this)
         }

            1->{
              binding.rv.adapter=Rvadapter(MyDate.listDaqiqa,this)
            }

            2->{
                binding.rv.adapter=Rvadapter(MyDate.listInternet,this)
            }
            3->{
                binding.rv.adapter=Rvadapter(MyDate.listXizmatlar,this)
            }
            4->{
                binding.rv.adapter=Rvadapter(MyDate.listSms,this)
            }
            5->{
                binding.rv.adapter=Rvadapter(MyDate.listYangiliklar,this)
            }


        }

        return binding.root
    }


    override fun onCLick(myInfo: Myinfo) {
        findNavController().navigate(R.id.infoFragment, bundleOf("keyInfo" to myInfo))

    }


}