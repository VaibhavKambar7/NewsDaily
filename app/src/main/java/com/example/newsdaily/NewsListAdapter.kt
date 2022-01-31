package com.example.newsdaily

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NewsListAdapter(private val items: ArrayList<String>,private val listener:NewsItemClicked): RecyclerView.Adapter<NewsViewHolder>() {//adapter ko data milega uske constructor ke andar
override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
    val view = LayoutInflater.from(parent.context).inflate(R.layout.items_news,parent,false)
    val viewHolder=NewsViewHolder(view)
    view.setOnClickListener{
        listener.OnItemClicked(items[viewHolder.adapterPosition])
    }
    return viewHolder
}

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {

        val currentItem=items[position]
        holder.titleView.text=currentItem

    }

    override fun getItemCount(): Int {

        return items.size

    }
}

class NewsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    val titleView: TextView=itemView.findViewById(R.id.title)
}

interface NewsItemClicked
{
    fun OnItemClicked(item: String)
}