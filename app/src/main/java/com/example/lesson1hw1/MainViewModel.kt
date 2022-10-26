package com.example.lesson1hw1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _innerLiveData = MutableLiveData<Int>()
    var outLiveData = _innerLiveData as LiveData<Int>
    private var counter = 0

    fun increment() {
        counter++
        _innerLiveData.value = counter
    }
}