package com.dcard.koinsample

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.dcard.component.AtmProvider
import com.dcard.component.NormalAtm

/**
 * @author Batu
 */
class MyViewModelFactory(
    private val useCase: UseCase
) : ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return modelClass.getDeclaredConstructor(
            AtmProvider::class.java
        ).newInstance(
            getAtmInstance()
        )
    }

    private fun getAtmInstance(): AtmProvider {
        return when (useCase) {
            UseCase.Normal -> NormalAtm()
        }
    }
}