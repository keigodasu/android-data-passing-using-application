package com.example.sample_using_application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SecondPageActivity : AppCompatActivity() {
    val deviceInfo = DeviceInfo.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_page)

        println("here" + deviceInfo?.deviceId)

    }
}
