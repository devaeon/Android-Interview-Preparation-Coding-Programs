package com.android.interview.preparation.programs

import kotlin.reflect.full.*

data class User(val name: String, val age: Int)

fun main() {
    val userClass = User::class

    // Getting class name
    println("Class Name: ${userClass.simpleName}")

    // Getting properties
    userClass.memberProperties.forEach { prop ->
        println("Property: ${prop.name}")
    }
}
