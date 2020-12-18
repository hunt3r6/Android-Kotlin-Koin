package id.sidedi.kotlinkoin.di.module

import id.sidedi.kotlinkoin.data.repository.MainRepository
import org.koin.dsl.module

val repoModule = module {
    single {
        MainRepository(get())
    }
}