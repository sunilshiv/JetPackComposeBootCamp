package com.jetpack.recyclerviewdemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jetpack.recyclerviewdemo.databinding.ListItemsBinding

class MyRecyclerViewAdapter(val fruitsList:List<Fruit>) : RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder>(){

    inner class ViewHolder(val binding: ListItemsBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ListItemsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       with(holder) {
           with(fruitsList[position]){
               binding.nameTextView.text = this.name
           }
       }
    }

    override fun getItemCount(): Int {
      return fruitsList.size
    }


}
