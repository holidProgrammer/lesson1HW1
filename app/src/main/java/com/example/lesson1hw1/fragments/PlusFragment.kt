package com.example.lesson1hw1.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.lesson1hw1.MainViewModel
import com.example.lesson1hw1.databinding.FragmentPlusBinding

class PlusFragment : Fragment() {

    private val viewModel: MainViewModel by lazy { ViewModelProvider(requireActivity())[MainViewModel::class.java] }
    private lateinit var binding: FragmentPlusBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("VM", "$viewModel")
        binding = FragmentPlusBinding.inflate(layoutInflater)
        binding.btnIncrement.setOnClickListener {
            viewModel.increment()
        }
        return binding.root
    }

}