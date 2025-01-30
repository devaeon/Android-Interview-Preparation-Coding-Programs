package com.android.interview.preparation.kotlinCode

// Kotlin class with a companion object
class User(val name: String) {
    companion object Factory {
        const val VERSION = 1
        var NEW_VERSION=2
        fun create(name: String): User {
            return User(name)
        }
    }
}