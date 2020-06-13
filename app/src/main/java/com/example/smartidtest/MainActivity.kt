package com.example.smartidtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kg.onoi.smart_sdk.SmartID
import kg.onoi.smart_sdk.utils.Config
import kg.onoi.smart_sdk.utils.ResponseWay
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_sign_up.setOnClickListener {
            SmartID.signUp(this) { sessionId, responseWay ->
                someAction(sessionId,responseWay)
            }
        }
        btn_sign_in.setOnClickListener {
            SmartID.signIn(this) { sessionId, responseWay ->
                someAction(sessionId,responseWay)
            }
        }

    }

    private fun someAction(sessionId: String, responseWay: ResponseWay) {

    }
}
