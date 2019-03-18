package com.mgtic.dapm.practica4

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    lateinit var mRecyclerView: RecyclerView
    val mAdapter: RecyclerAdapter = RecyclerAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupRecyclerView()
    }

    fun setupRecyclerView(){
        mRecyclerView = findViewById(R.id.rvSuperheroList)as RecyclerView
        mRecyclerView.setHasFixedSize(true)
        mRecyclerView.layoutManager = LinearLayoutManager(this)
        mAdapter.RecyclerAdapter(getSuperheroes(),this)
        mRecyclerView.adapter = mAdapter
    }

    fun getSuperheroes(): MutableList<Superhero>{
        var superheros: MutableList<Superhero> = mutableListOf()
        superheros.add(
            Superhero(
                "Spiderman", "Marvel", "Peter Parker","https://cursokotlin.com/wp-content/uploads/2017/07/spiderman.jpg"))
        superheros.add(
            Superhero("Daredevil", "Marvel", "Matthew Michael Murdock ", "https://cursokotlin.com/wp-content/uploads/2017/07/daredevil.jpg"))
        superheros.add(
            Superhero("Wolverine", "Marvel", "James Howlett","https://cursokotlin.com/wp-content/uploads/2017/07/logan.jpeg"))
        superheros.add(
            Superhero("Batman", "DC", "Bruce Wayne", "https://cursokotlin.com/wp-content/uploads/2017/07/batman.jpg"))
        superheros.add(
            Superhero("Thor", "Marvel", "Thor Odinson", "https://cursokotlin.com/wp-content/uploads/2017/07/thor.jpg"))
        superheros.add(
            Superhero("Flash", "DC", "Jay Garrick", "https://cursokotlin.com/wp-content/uploads/2017/07/flash.png"))
        superheros.add(
            Superhero("Green Lantern", "DC", "Alan Scott","https://cursokotlin.com/wp-content/uploads/2017/07/green-lantern.jpg"))
        superheros.add(
            Superhero("Wonder Woman", "DC", "Princess Diana","https://cursokotlin.com/wp-content/uploads/2017/07/wonder_woman.jpg"))
        return superheros
    }
}
