package com.example.spravoshnikrubaka

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.content_layout.*
import kotlinx.android.synthetic.main.item_layout.*

class ContentActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_layout)
        tvTitle1.text = intent.getStringExtra("title")
        tvContent1.text = intent.getStringExtra("Content")
        im2.setImageResource(intent.getIntExtra("image",R.drawable.som))

    }
}