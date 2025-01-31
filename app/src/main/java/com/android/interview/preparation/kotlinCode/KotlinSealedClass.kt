package com.android.interview.preparation.kotlinCode

sealed class Result {
    data class Success(val data: String) : Result()
    data class Error(val message: String) : Result()
}


sealed interface Event
data class Click(val x: Int, val y: Int) : Event
data class Scroll(val distance: Int) : Event

