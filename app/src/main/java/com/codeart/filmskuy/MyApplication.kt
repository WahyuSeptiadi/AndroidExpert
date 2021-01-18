package com.codeart.filmskuy

import android.app.Application
import com.codeart.filmskuy.core.di.databaseModule
import com.codeart.filmskuy.core.di.networkModule
import com.codeart.filmskuy.core.di.repositoryModule
import com.codeart.filmskuy.di.useCaseModule
import com.codeart.filmskuy.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

/**
 * Created by wahyu_septiadi on 18, January 2021.
 * Visit My GitHub --> https://github.com/WahyuSeptiadi
 */

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.NONE)
            androidContext(this@MyApplication)
            modules(
                listOf(
                    databaseModule,
                    networkModule,
                    repositoryModule,
                    useCaseModule,
                    viewModelModule
                )
            )
        }
    }
}