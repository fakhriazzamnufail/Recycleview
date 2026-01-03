package com.example.recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SantriAdapter(private val dataSantri : List<String>): RecyclerView.Adapter<SantriAdapter.SantriViewHolder>() {

    class SantriViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val tvNama: TextView = itemView.findViewById(R.id.tvNamaSantri)
    }
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SantriAdapter.SantriViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_item_santri, parent, false)
        return SantriViewHolder(view)
    }

    override fun onBindViewHolder(holder: SantriAdapter.SantriViewHolder, position: Int) {
        holder.tvNama.text =dataSantri[position]
    }

    override fun getItemCount(): Int {
        return dataSantri.size
    }
}