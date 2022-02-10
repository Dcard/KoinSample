package com.dcard.component

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.dcard.capability.AtmProvider

/**
 * @author Batu
 */
class NormalAtm : AtmProvider {

    override val amount: LiveData<Int>
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

    override fun onDeposit(value: Int) {
        _amout.value = _amout.value?.plus(value)
    }

    override fun onWithdraw(value: Int) {
        _amout.value = _amout.value?.minus(value)
    }

    override fun onRemit(value: Int) {
        val total = (value * 1.1f).toInt()
        _amout.value = _amout.value?.minus(total)
    }
}