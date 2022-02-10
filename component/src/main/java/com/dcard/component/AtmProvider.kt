package com.dcard.component

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