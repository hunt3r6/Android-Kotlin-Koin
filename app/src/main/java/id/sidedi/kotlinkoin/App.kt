package id.sidedi.kotlinkoin

import android.app.Application
import id.sidedi.kotlinkoin.di.module.appModule
import id.sidedi.kotlinkoin.di.module.repoModule
import id.sidedi.kotlinkoin.di.module.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(listOf(appModule, repoModule, viewModelModule))
        }
    }
}