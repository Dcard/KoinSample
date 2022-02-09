package com.dcard.koin

import com.dcard.component.AtmProvider
import com.dcard.component.NormalAtm
import com.dcard.koinsample.MainViewModel
import com.dcard.koinsample.UseCase
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.parameter.parametersOf
import org.koin.dsl.module

/**
 * @author Batu
 */
val atmInjectModule = module {
    viewModel { params ->
        MainViewModel(
            get { parametersOf(params.get()) }
        )
    }

    factory<AtmProvider> { (useCase: UseCase) ->
        when (useCase) {
            UseCase.Normal -> NormalAtm()
        }
    }
}
