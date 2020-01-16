package com.example.hwboot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.hwboot.adapter.BootsAdapter
import com.example.hwboot.model.Boots

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recyclerView: RecyclerView = findViewById(R.id.boots_recycler)
        var BootArray = ArrayList<Boots>()
        BootArray.add(Boots("001",R.drawable.boot1,"Nike Superfly","Elite FG","$799"))
        BootArray.add(Boots("002",R.drawable.boot2,"Air Superfly","Flyknit","$1280"))
        BootArray.add(Boots("003",R.drawable.boot3,"Air Jordan","Retro Se","$2400"))
        BootArray.add(Boots("004",R.drawable.boot4,"leBron XVI","Low EP","$1099"))
        BootArray.add(Boots("005",R.drawable.boot5,"Jordan Why","PF","$2699"))
        BootArray.add(Boots("006",R.drawable.boot6,"leBron Superfly","SB EP","$1280"))
        val bootsAdapter = BootsAdapter(BootArray)
        recyclerView.layoutManager= GridLayoutManager(this,2)
        recyclerView.adapter = bootsAdapter
    }
}
