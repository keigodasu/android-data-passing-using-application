package com.example.sample_using_application

class DeviceInfo{
    var deviceId: String? = null
    var status: String? = null

    companion object {
        private var instance: DeviceInfo? = null

        fun getInstance(): DeviceInfo? {
            if (instance == null)
                instance = DeviceInfo()

            return instance
        }
    }
}

