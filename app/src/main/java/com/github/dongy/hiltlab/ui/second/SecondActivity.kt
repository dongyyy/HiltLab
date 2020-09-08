package com.github.dongy.hiltlab.ui.second

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.github.dongy.hiltlab.R
import com.github.dongy.hiltlab.data.MyRepository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SecondActivity : AppCompatActivity() {
    @Inject
    lateinit var repository : MyRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Log.d("test SecondActivity", "${repository.hashCode()}")
    }
}