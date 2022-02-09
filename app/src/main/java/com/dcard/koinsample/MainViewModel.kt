package com.dcard.koinsample

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.dcard.component.NormalAtm

/**
 * @author Batu
 */
class MainViewModel(
    private val atm: NormalAtm
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