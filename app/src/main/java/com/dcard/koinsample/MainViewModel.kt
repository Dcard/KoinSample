package com.dcard.koinsample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * @author Batu
 */
class MainViewModel : ViewModel() {

    val amount: LiveData<Int>
        get() = _amout

    private val _amout = MutableLiveData<Int>().apply {
        value = 10000
    }

    fun onDeposit(value: Int) {
        _amout.value = _amout.value?.plus(value)
    }

    fun onWithdraw(value: Int) {
        _amout.value = _amout.value?.minus(value)
    }

    fun onRemit(value: Int) {
        val total = (value * 1.1f).toInt()
        _amout.value = _amout.value?.minus(total)
    }
}