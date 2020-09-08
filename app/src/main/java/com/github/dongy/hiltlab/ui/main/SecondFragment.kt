package com.github.dongy.hiltlab.ui.main

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.github.dongy.hiltlab.R
import com.github.dongy.hiltlab.data.MyRepository
import com.github.dongy.hiltlab.di.qualifier.ActivityHash
import com.github.dongy.hiltlab.di.qualifier.AppHash
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_second.*
import javax.inject.Inject

@AndroidEntryPoint
class SecondFragment : Fragment() {
    private val viewModel by viewModels<MainViewModel>()
    private val activityViewModel by activityViewModels<MainViewModel>()

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
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_mainFragment)
        }

        Log.d("test SecondFragment", "${repository.hashCode()}")
        Log.d("test SecondFragment", "applicationHash: ${applicationHash}")
        Log.d("test SecondFragment", "activityHash: ${activityHash}")
        Log.d("test SecondFragment", "viewModel: ${viewModel.getRepositoryHash()}")
        Log.d("test SecondFragment", "viewModel: $viewModel")
        Log.d("test SecondFragment", "activityViewModel: ${activityViewModel.getRepositoryHash()}")
        Log.d("test SecondFragment", "activityViewModel: $activityViewModel")
    }
}