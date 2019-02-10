package ru.turaevmaksim.navalny.ui.main

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val counter = MutableLiveData<Int>()
    var number = 0

    fun onButtonClick() {
        counter.value = ++number
    }
}
