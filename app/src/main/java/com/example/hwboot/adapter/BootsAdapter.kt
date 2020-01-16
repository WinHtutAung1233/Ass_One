package com.example.hwboot.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.hwboot.R
import com.example.hwboot.model.Boots

class BootsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var bootQty = itemView.findViewById<TextView>(R.id.boot_qty)
    var bootImage=itemView.findViewById<ImageView>(R.id.boot_img)
    var bootName = itemView.findViewById<TextView>(R.id.boot_name)
    var bootType = itemView.findViewById<TextView>(R.id.boot_type)
    var bootPrice = itemView.findViewById<TextView>(R.id.boot_price)
}

class BootsAdapter(var bootsList: ArrayList<Boots>) : RecyclerView.Adapter<BootsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BootsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.boots, parent, false) //always parent,false
        return BootsViewHolder(view)
    }

    override fun getItemCount(): Int {
        return bootsList.size
    }

    override fun onBindViewHolder(holder: BootsViewHolder, position: Int) {
        holder.bootQty.text = bootsList[position].boot_qty
        holder.bootImage.setImageResource(bootsList[position].boot_img)
        holder.bootName.text = bootsList[position].boot_name
        holder.bootType.text = bootsList[position].boot_type
        holder.bootPrice.text = bootsList[position].boot_price
    }

}