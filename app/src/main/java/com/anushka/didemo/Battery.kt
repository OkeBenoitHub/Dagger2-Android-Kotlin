package com.anushka.didemo

/**
 * To create a dependency injection for interface
 * => First create a class NCBattery to implement the interface => inject constructor
 * => Then create a class module to binds to NCBattery
 * => Add module to SmartPhoneComponent
 */
interface Battery {
    fun getPower()
}
