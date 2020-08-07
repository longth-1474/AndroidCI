package com.android.ci.di

import com.android.ci.data.repository.SampleRepository
import com.android.ci.data.repository.impl.SampleRepositoryImpl
import org.koin.dsl.module

/**
 * Declare repository component
 * @param get() is a component given
 */
val repositoryModule = module {
    single<SampleRepository> { SampleRepositoryImpl(get()) }
}
