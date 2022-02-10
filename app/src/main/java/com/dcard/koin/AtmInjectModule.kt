package com.dcard.koin

import com.dcard.capability.AtmProvider
import com.dcard.component.NormalAtm
import com.dcard.feature.AtmViewModel
import com.dcard.feature.UseCase
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.parameter.parametersOf
import org.koin.dsl.module

/**
 * @author Batu
 */
val atmInjectModule = module {
    viewModel { params ->
        AtmViewModel(
            get { parametersOf(params.get()) }
        )
    }

    factory<AtmProvider> { (useCase: UseCase) ->
        when (useCase) {
            UseCase.Normal -> NormalAtm()
        }
    }
}
