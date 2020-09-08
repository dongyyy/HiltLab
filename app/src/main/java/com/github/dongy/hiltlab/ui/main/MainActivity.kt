package com.github.dongy.hiltlab.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.github.dongy.hiltlab.R
import com.github.dongy.hiltlab.data.MyRepository

class MainActivity : AppCompatActivity() {
    val repository  = MyRepository()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("test MainActivity", "${repository.hashCode()}")
    }
}