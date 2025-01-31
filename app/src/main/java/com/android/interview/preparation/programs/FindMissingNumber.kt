package com.android.interview.preparation.programs

fun findMissingNumber(arr: List<Int>, n: Int): Int {
    val expectedSum = (n * (n + 1)) / 2   //36
    val actualSum = arr.sum()
    return expectedSum - actualSum
}

fun main() {
    val numbers = listOf(1, 2, 4, 5, 3, 7, 8)
    println(findMissingNumber(numbers, 8))
}
