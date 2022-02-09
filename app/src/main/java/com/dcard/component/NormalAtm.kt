package com.dcard.component

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

/**
 * @author Batu
 */
class NormalAtm {

    val amount: LiveData<Int>
        get() = _amout

    private val _amout = MutableLiveData<Int>().apply {
        value = 0
    }

    init {
        loadDefaultAmount()
    }

    private fun loadDefaultAmount() {
        _amout.value = 10000
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