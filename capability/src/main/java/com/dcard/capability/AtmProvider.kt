package com.dcard.capability

import androidx.lifecycle.LiveData

/**
 * @author Batu
 */
interface AtmProvider {
    val amount: LiveData<Int>

    fun onDeposit(value: Int)
    fun onWithdraw(value: Int)
    fun onRemit(value: Int)
}