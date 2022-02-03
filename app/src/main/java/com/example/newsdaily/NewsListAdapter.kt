package com.example.Newspaper

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.newsdaily.databinding.ItemsNewsBinding

class NewsListAdapter(private val items: ArrayList<String>): RecyclerView.Adapter<NewsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {

//        }
        return NewsViewHolder(ItemsNewsBinding.inflate(LayoutInflater.from(parent.context),parent,false))

    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {



        holder.bind(items[position])

    }

    override fun getItemCount(): Int {

        return items.size

    }
}

class NewsViewHolder(val binding: ItemsNewsBinding): RecyclerView.ViewHolder(binding.root)
{
    fun bind(items:String)
    {
        binding.title.text=items
    }

}
