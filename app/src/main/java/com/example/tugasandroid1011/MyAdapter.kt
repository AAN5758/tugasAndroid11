package com.example.tugasandroid1011

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.tugasandroid1011.databinding.ReyclerViewBinding

class MyAdapter (private val data: ArrayList<RecyclerView>, val onClick: (RecyclerView)->Unit): androidx.recyclerview.widget.RecyclerView.Adapter<ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ReyclerViewBinding.inflate(LayoutInflater.from(parent.context),parent, false))
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.tvName.text=data[position].tvName
        holder.binding.tvSchool.text=data[position].tvSchool
        holder.binding.tvClass.text=data[position].tvClass
        holder.binding.imgPhoto.setImageResource(data[position].imgPhoto)
        holder.itemView.setOnClickListener {
            onClick(data[position])
        }
    }
}