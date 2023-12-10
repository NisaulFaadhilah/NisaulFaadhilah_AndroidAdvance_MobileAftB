package com.example.nisauladvance

import android.view.LayoutInflater
import android.view.ViewGroup

class AdapterRecycler(private val data : ArrayList<RecyclerView>): androidx.recyclerview.widget.RecyclerView.Adapter<ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater: LayoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(inflater, parent)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])
    }
}