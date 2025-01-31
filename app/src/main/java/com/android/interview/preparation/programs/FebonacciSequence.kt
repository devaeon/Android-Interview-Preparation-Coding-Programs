package com.android.interview.preparation.programs

fun fibonacci(n: Int): List<Int> {
    val fibList = mutableListOf(0, 1)
    for (i in 2 until n) {
        fibList.add(fibList[i - 1] + fibList[i - 2])
    }
    return fibList
}

fun main() {
    println(fibonacci(10)) // Output: [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
}
