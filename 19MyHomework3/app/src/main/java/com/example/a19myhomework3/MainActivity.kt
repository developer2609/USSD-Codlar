package com.example.a19myhomework3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Visibility
import android.view.View
import androidx.core.graphics.luminance
import androidx.viewpager.widget.ViewPager
import com.example.a19myhomework3.adapter.MyFragmentPAgerAdapter
import com.example.a19myhomework3.databinding.ActivityMainBinding
import com.example.a19myhomework3.databinding.FragmentBlankBinding
import com.example.a19myhomework3.models.User

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var list: ArrayList<User>
    private lateinit var myFragmentPAgerAdapter: MyFragmentPAgerAdapter

    private var index=0
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        list= ArrayList()



        list.add(User("Click va Paymega o'tish xizmati",R.drawable.group1.toString()))
        list.add(User("Barcha operatorlar boyicha statistika",R.drawable.group3.toString()))
        list.add(User("Tariflarni filtirlash",R.drawable.group4.toString()))
        list.add(User("Yangi imkoniyatlar",R.drawable.group5.toString()))




        myFragmentPAgerAdapter= MyFragmentPAgerAdapter(supportFragmentManager,list)
binding.viewPager.adapter=myFragmentPAgerAdapter


        binding.dotsIndicator.attachTo(binding.viewPager)


       binding.viewPager.addOnPageChangeListener(object :ViewPager.OnPageChangeListener{
           override fun onPageScrolled(
               position: Int,
               positionOffset: Float,
               positionOffsetPixels: Int
           ) {
               index=position
           }

           override fun onPageSelected(position: Int) {
           }

           override fun onPageScrollStateChanged(state: Int) {
           }


       })

        binding.otkazibYuborish.setOnClickListener {
            if (index == 0){
                ++index
                ++index
                ++index
                ++index
                binding.viewPager.currentItem = index
            }else if (index == 1){
                ++index
                ++index
                ++index
                binding.viewPager.currentItem = index
            }else if (index == 2){
                ++index
                ++index
                binding.viewPager.currentItem = index
            }else if (index == 3){
                ++index
                binding.viewPager.currentItem = index

            }
        }

        binding.keyingisi.setOnClickListener{
            if (index==0){
                ++index
                binding.viewPager.currentItem=index

            }else if (index==1){
                ++index
                binding.viewPager.currentItem=index
            }else if (index==2){

                ++index
                binding.viewPager.currentItem=index
                binding.keyingisi.visibility=View.GONE
                binding.rasm.visibility=View.GONE



            }


        }



    }
}