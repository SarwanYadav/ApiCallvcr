package com.example.apicall16.Adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.apicall16.Model.Data
import com.example.apicall16.R

class MyAdapter(val context: Activity, val productData: List<Data>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {


    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var title: TextView
        var image: ImageView

        init {
            title = itemView.findViewById(R.id.textView)
            image = itemView.findViewById(R.id.imageView)

        }


    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.each_iteam, parent, false)
        return MyViewHolder(itemView)
    }


    override fun getItemCount(): Int {
        return productData.size
    }


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = productData[position]
        holder.title.text = currentItem.ConsumerName
        holder.image.setImageResource(currentItem.VCRID)

    }

}
