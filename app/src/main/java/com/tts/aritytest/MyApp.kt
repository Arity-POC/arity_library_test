package com.tts.aritytest

import android.app.Application
import com.tts.sdk.MyProvider

class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        MyProvider().provide()
    }
}