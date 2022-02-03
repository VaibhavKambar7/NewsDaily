package com.example.Newspaper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.newsdaily.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(){
    private lateinit var recyclerView: RecyclerView
    private lateinit var Adapter:NewsListAdapter

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerView.layoutManager=LinearLayoutManager(this)
        val items=fetchData()
        val Adapter=NewsListAdapter(items)
        binding.recyclerView.adapter=Adapter

    }

    private fun fetchData():ArrayList<String>
    {
        val list = ArrayList<String>()
        for(i in 0 until 100)
        {
            list.add("Item $i")
        }

        return list
    }



}