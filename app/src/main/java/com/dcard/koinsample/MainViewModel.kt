package com.dcard.koinsample

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.dcard.component.AtmProvider
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.koin.core.parameter.parametersOf

/**
 * @author Batu
 */
class MainViewModel(
    private val useCase: UseCase
) : ViewModel(), KoinComponent {

    private val atm: AtmProvider by inject {
        parametersOf(useCase)
    }

    val amount: LiveData<Int>
        get() = atm.amount

    fun onDeposit(value: Int) {
        atm.onDeposit(value)
        // Another way to get AtmProvider instance by Koin
        /* get<AtmProvider> { parametersOf(useCase) }.onDeposit(value) */
    }

    fun onWithdraw(value: Int) {
        atm.onWithdraw(value)
    }

    fun onRemit(value: Int) {
        atm.onRemit(value)
    }
}