package com.example.mybelineapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mybelineapp.BlankFragment
import com.example.mybelineapp.Myinfo.Myinfo
import com.example.mybelineapp.databinding.ItemBinding

class Rvadapter(val list:List<Myinfo>, val rvClick: BlankFragment):RecyclerView.Adapter<Rvadapter.Vh>() {

inner class Vh(var itemRvBinding: ItemBinding):RecyclerView.ViewHolder(itemRvBinding.root){

    fun onBind(myInfo: Myinfo, position: Int){
        itemRvBinding.tvName.text = myInfo.name
        itemRvBinding.tvCode.text = myInfo.code  

        itemRvBinding.root.setOnClickListener {
            rvClick.onCLick(myInfo)
        }

}
}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position], position)
    }

    override fun getItemCount(): Int=list.size
    interface RvClick{
        fun onCLick(myInfo: Myinfo)
    }
}