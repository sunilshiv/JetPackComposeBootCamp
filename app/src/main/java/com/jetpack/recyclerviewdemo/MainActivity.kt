package com.jetpack.recyclerviewdemo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.jetpack.recyclerviewdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var activityMainBinding: ActivityMainBinding
    val fruitsList = listOf(Fruit("Mango"), Fruit("Apple"),Fruit("Banana") , Fruit("Guava"),Fruit("Lemon"),Fruit("Pear"),Fruit("Orange"))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        activityMainBinding.myRecyclerView.setBackgroundColor(Color.YELLOW)

        activityMainBinding.myRecyclerView.layoutManager = LinearLayoutManager(this)
        activityMainBinding.myRecyclerView.adapter = MyRecyclerViewAdapter(fruitsList)
    }
}