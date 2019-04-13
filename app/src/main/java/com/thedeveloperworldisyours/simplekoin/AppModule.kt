package com.thedeveloperworldisyours.simplekoin

import org.koin.dsl.module

object AppModule {

    val appModule = module {

        // single instance of HelloRepository
        single<HelloRepository> { HelloRepositoryImpl() }

        // Simple Presenter Factory
        factory { MainPresenter(get()) }
    }
}