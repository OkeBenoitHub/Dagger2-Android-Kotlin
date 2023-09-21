package com.anushka.didemo

import android.util.Log
import javax.inject.Inject

// If we don't own the memory card :: create a module for dependency injection
class MemoryCard {
    init {
        Log.i("MYTAG","Memory Card Constructed")
    }

    fun getSpaceAvailablity(){
        Log.i("MYTAG","Memory space available")
    }
}