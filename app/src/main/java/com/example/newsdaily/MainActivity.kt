package com.example.newsdaily

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity(), NewsItemClicked {
    private lateinit var recyclerView: RecyclerView
    private lateinit var Adapter:NewsListAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView=findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager=LinearLayoutManager(this)
        val items=fetchData()
        val Adapter=NewsListAdapter(items,this)
        recyclerView.adapter=Adapter

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

    override fun OnItemClicked(item: String) {
        Toast.makeText(this,"Clicked item is $item",Toast.LENGTH_LONG).show()
    }

}