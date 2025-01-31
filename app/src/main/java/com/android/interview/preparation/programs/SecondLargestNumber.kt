package com.android.interview.preparation.programs

fun secondLargest(arr: List<Int>): Int? {
    var first = Int.MIN_VALUE
    var second = Int.MIN_VALUE

    for (num in arr) {
        if (num > first) {
            second = first
            first = num
        } else if (num > second && num != first) {
            second = num
        }
    }
    return if (second == Int.MIN_VALUE) null else second
}

fun main() {
    val numbers = listOf(10, 5, 8, 20, 15)
    println(secondLargest(numbers))  // Output: 15
}
