package com.github.dongy.hiltlab.ui.main

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.github.dongy.hiltlab.R
import com.github.dongy.hiltlab.data.MyRepository
import com.github.dongy.hiltlab.di.qualifier.ActivityHash
import com.github.dongy.hiltlab.di.qualifier.AppHash
import com.github.dongy.hiltlab.ui.second.SecondActivity
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_main.*
import javax.inject.Inject

@AndroidEntryPoint
class MainFragment : Fragment() {
    @Inject
    lateinit var repository : MyRepository

    @AppHash
    @Inject
    lateinit var applicationHash : String

    @ActivityHash
    @Inject
    lateinit var activityHash : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button_activity.setOnClickListener {
            val intent = Intent(requireContext(), SecondActivity::class.java)
            startActivity(intent)
        }

        button_fragment.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_secondFragment)
        }

        Log.d("test MainFragment", "${repository.hashCode()}")
        Log.d("test MainFragment", "applicationHash: ${applicationHash}")
        Log.d("test MainFragment", "activityHash: ${activityHash}")
    }
}