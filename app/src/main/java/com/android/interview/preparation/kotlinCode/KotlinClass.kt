package com.android.interview.preparation.kotlinCode


class KotlinClass{
    var name = "Hello Kotlin class "

    // Kotlin code with default parameter
    /*
    * Without @JvmOverloads, Java cannot call greet() without an argument,
    *  because Kotlin does not generate an overload for it.
    * */

    // Kotlin function with nullable parameter
    fun greetNullable(name: String?) {
        name?.let {
            println("Hello, $it")
        }?: println("Hello, World")
    }

    @JvmOverloads
    // Kotlin function with default argument
    fun greet(name: String = "World", age: Int = 18) {
        println("Hello, $name. You are $age years old.")
    }

}

// Kotlin Code
fun sum(a: Int, b: Int): Int {
    return a + b
}