package com.example.smartidtest

import android.app.Application
import android.content.Context
import kg.onoi.smart_sdk.SmartID
import kg.onoi.smart_sdk.utils.Config

class App : Application(){

    companion object {
        var context: Context? = null
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext

        val sdkConfig = Config(
            context!!,
            resources.getDrawable(R.drawable.smart_logo),
            resources.getString(R.string.app_name),
            "https://smartidregistration.onoi.kg/",
            "https://smartidkg.onoi.kg/",
            "AC7D9FC3-45F5-42DD-B227-40C639505A2E", "ru",  false)
        SmartID.setup(sdkConfig)

    }

}