package com.android.interview.preparation.kotlinCode

// Kotlin class using delegation
interface Printer {
    fun print(message: String)
}

class PrinterImpl : Printer {
    override fun print(message: String) {
        println(message)
    }
}

class DelegatedPrinter(printer: Printer) : Printer by printer
