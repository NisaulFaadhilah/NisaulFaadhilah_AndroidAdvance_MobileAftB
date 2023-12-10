package com.example.nisauladvance

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: AdapterRecycler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

    }
    private fun init(){
       recyclerView = findViewById(R.id.recycler_view)

        val data = ArrayList<com.example.nisauladvance.RecyclerView>()
        data.add(RecyclerView(R.drawable.ayam, txtTitle = "Ayam", txtSubTitle = "Aku adalah seekor ayam lucu"))
        data.add(RecyclerView(R.drawable.domba, txtTitle = "Domba", txtSubTitle = "Aku adalah seekor domba lucu"))
        data.add(RecyclerView(R.drawable.koala, txtTitle = "Koala", txtSubTitle = "Aku adalah seekor koala lucu"))
        data.add(RecyclerView(R.drawable.kucing, txtTitle = "Kucing", txtSubTitle = "Aku adalah seekor Kucing lucu"))
        data.add(RecyclerView(R.drawable.uburubur, txtTitle = "Ubur Ubur", txtSubTitle = "Aku adalah ubur-ubur lucu"))
        data.add(RecyclerView(R.drawable.ayam, txtTitle = "Ayam", txtSubTitle = "Aku adalah seekor ayam lucu"))
        data.add(RecyclerView(R.drawable.domba, txtTitle = "Domba", txtSubTitle = "Aku adalah seekor domba lucu"))
        data.add(RecyclerView(R.drawable.koala, txtTitle = "Koala", txtSubTitle = "Aku adalah seekor koala lucu"))
        data.add(RecyclerView(R.drawable.kucing, txtTitle = "Kucing", txtSubTitle = "Aku adalah seekor Kucing lucu"))
        data.add(RecyclerView(R.drawable.uburubur, txtTitle = "Ubur Ubur", txtSubTitle = "Aku adalah ubur-ubur lucu"))
        data.add(RecyclerView(R.drawable.ayam, txtTitle = "Ayam", txtSubTitle = "Aku adalah seekor ayam lucu"))
        data.add(RecyclerView(R.drawable.domba, txtTitle = "Domba", txtSubTitle = "Aku adalah seekor domba lucu"))
        data.add(RecyclerView(R.drawable.koala, txtTitle = "Koala", txtSubTitle = "Aku adalah seekor koala lucu"))
        data.add(RecyclerView(R.drawable.kucing, txtTitle = "Kucing", txtSubTitle = "Aku adalah seekor Kucing lucu"))
        data.add(RecyclerView(R.drawable.uburubur, txtTitle = "Ubur Ubur", txtSubTitle = "Aku adalah ubur-ubur lucu"))

        adapter = AdapterRecycler(data)
    }
}