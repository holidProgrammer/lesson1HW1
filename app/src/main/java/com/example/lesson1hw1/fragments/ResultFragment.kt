package com.example.lesson1hw1.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.lesson1hw1.MainViewModel
import com.example.lesson1hw1.databinding.FragmentResultBinding

class ResultFragment : Fragment() {

    private val viewModel: MainViewModel by lazy { ViewModelProvider(requireActivity())[MainViewModel::class.java] }
    private lateinit var binding: FragmentResultBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentResultBinding.inflate(layoutInflater)
        Log.d("VM2", "$viewModel")
        viewModel.outLiveData.observe(viewLifecycleOwner) {
            Log.d("ResultFragment", it.toString())
            binding.tvResult.text = it.toString()
        }

        return binding.root
    }

}