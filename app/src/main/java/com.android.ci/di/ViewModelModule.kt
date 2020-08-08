package com.android.ci.di

import com.android.ci.ui.sample.SampleViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * Declare viewmodel component
 * @param get() is a component given
 */
val viewModelModule = module {
    viewModel { SampleViewModel(get()) }
}

