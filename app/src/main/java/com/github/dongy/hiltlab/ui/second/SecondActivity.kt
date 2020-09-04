package com.github.dongy.hiltlab.ui.second

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.github.dongy.hiltlab.R
import com.github.dongy.hiltlab.ui.data.MyRepository

class SecondActivity : AppCompatActivity() {
    val repository = MyRepository()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Log.d("dongyyy SecondActivity", "${repository.hashCode()}")
    }
}