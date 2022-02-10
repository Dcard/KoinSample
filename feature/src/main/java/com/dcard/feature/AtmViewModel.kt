package com.dcard.feature

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.dcard.capability.AtmProvider

/**
 * @author Batu
 */
class AtmViewModel(
    private val atm: AtmProvider
) : ViewModel() {

    val amount: LiveData<Int>
    get() = atm.amount

    fun onDeposit(value: Int) {
        atm.onDeposit(value)
    }

    fun onWithdraw(value: Int) {
        atm.onWithdraw(value)
    }

    fun onRemit(value: Int) {
        atm.onRemit(value)
    }
}