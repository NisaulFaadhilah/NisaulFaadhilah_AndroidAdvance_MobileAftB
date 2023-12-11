package com.example.nisauladvance

import android.os.Bundle
import android.os.PersistableBundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
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
<<<<<<< HEAD

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.tbAddcontact -> Toast.makeText(this, "Kamu Menekan Add Contact", Toast.LENGTH_LONG).show()
            R.id.tbFavorit -> Toast.makeText(this, "Kamu Menekan Favorit", Toast.LENGTH_LONG).show()
            R.id.tbSetting -> Toast.makeText(this, "Kamu Menekan Setting", Toast.LENGTH_LONG).show()
            R.id.tbFeedback -> Toast.makeText(this, "Kamu Menekan Feedback", Toast.LENGTH_LONG).show()
            R.id.tbClose -> finish()
        }
        return true
    }
=======
>>>>>>> 7c8cc451f4968ee5d3f58df74fbc6c4131e4e4ee
}