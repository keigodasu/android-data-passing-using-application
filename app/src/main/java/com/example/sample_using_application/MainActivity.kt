package com.example.sample_using_application

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    val deviceInfo = DeviceInfo.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        deviceInfo?.deviceId = "001"
        deviceInfo?.status = "success"

        println("here"+deviceInfo?.deviceId)

        val intent = Intent(applicationContext, SecondPageActivity::class.java)
        startActivity(intent)
    }
}

