package com.example.tugasandroid1011

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatDelegate
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tugasandroid1011.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.darkMode.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked)
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            else
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        }

        init()
    }

    private fun init() {
        binding.recycleView

        var data = ArrayList <RecyclerView> ()
        data.add(RecyclerView(R.drawable.alfred_kun, "Alfred Aisytiens Nathan", "SMKN 1 Purwokerto", "X PPLG 1"))
        data.add(RecyclerView(R.drawable.isal_kun, "Faishal Mukhammad Syarief", "SMKN 1 Purwokerto", "X PPLG 1"))
        data.add(RecyclerView(R.drawable.fabe_kun, "Fabe Bustanul Fatichin", "SMKN 1 Purwokerto", "X PPLG 1"))
        val adapter=MyAdapter(data){
            val toDetail = Intent(this, DetailViewActivity::class.java).apply {
                putExtra("name", it.tvName)
                putExtra("school", it.tvSchool)
                putExtra("photo", it.imgPhoto)
                putExtra("class", it.tvClass)
            }
            startActivity(toDetail)
        }
        binding.recycleView.layoutManager=LinearLayoutManager(this)
        binding.recycleView.adapter=adapter
    }

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }
}