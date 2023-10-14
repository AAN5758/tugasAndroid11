package com.example.tugasandroid1011

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.tugasandroid1011.databinding.ActivityDetailViewBinding

class DetailViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailViewBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this, R.layout.activity_detail_view)
        binding.nama = intent.getStringExtra("name")
        binding.sekolah = intent.getStringExtra("school")
        binding.kelas = intent.getStringExtra("class")
        binding.photo = intent.getIntExtra("photo", 0)
    }
}