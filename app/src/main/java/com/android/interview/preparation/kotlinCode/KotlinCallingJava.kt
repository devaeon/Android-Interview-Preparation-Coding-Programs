package com.android.interview.preparation.kotlinCode

import com.android.interview.preparation.javaCode.Greeting
import com.android.interview.preparation.javaCode.JavaAbstractClass
import com.android.interview.preparation.javaCode.JavaClass
import com.android.interview.preparation.javaCode.JavaClassException


// Kotlin code
fun main() {

    //Creating instance of Java clas in kotlin
    val javaClass = JavaClass()

    //set java properties
    javaClass.number= 23

    //get java properties
    println(javaClass.number)

    //Calling java annotation
    println(javaClass.toString())

    //calling java method in kotlin
    val result = javaClass.add(3, 4)
    println("Sum: $result")

    //Calling java Interface
    val greeting= GreetingClass()
    greeting.greet("Muzammil Hussain")

    // Calling java abstract Class
    val javaAbstractClass= KotlinClassCallingAbstract()
    javaAbstractClass.sayHello()

    //Calling java exceptions
    val javaException= JavaClassException()
    javaException.throwError()

}

class GreetingClass:Greeting{
    override fun greet(name: String?) {
        println("Hello $name, This is java interface calling from kotlin")
    }
}

// Kotlin class extending abstract Java class
class KotlinClassCallingAbstract : JavaAbstractClass() {
    override fun sayHello() {
        println("Hello from Kotlin calling java abstract class!")
    }
}
