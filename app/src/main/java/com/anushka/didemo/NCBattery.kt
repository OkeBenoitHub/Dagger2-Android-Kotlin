package com.anushka.didemo

import android.util.Log
import javax.inject.Inject

class NCBattery @Inject constructor(): Battery {
    override fun getPower() {
        Log.i("MYTAG"," Power from NCBattery")
    }
}