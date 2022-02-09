package com.dcard.koinsample

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.dcard.component.AtmProvider

/**
 * @author Batu
 */
class MainViewModel(
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