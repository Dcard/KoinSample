package com.dcard.koinsample

import android.app.Application
import com.dcard.koin.atmInjectModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

/**
 * @author Batu
 */
class MyApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        // start Koin!
        startKoin {
            // declare used Android context
            androidContext(this@MyApplication)
            // declare modules
            modules(atmInjectModule)
        }
    }
}