package com.dcard.koinsample

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.dcard.component.NormalAtm

/**
 * @author Batu
 */
class MyViewModelFactory(
    private val normalAtm: NormalAtm
) : ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return modelClass.getDeclaredConstructor(
            NormalAtm::class.java
        ).newInstance(
            normalAtm
        )
    }
}