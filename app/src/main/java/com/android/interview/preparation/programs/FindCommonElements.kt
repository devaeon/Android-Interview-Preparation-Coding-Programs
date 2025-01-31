package com.android.interview.preparation.programs

fun findCommonElements(vararg lists: List<Int>): List<Int> {
    return lists.reduce { acc, list -> acc.intersect(list).toList() }
}

fun main() {
    val list1 = listOf(1, 2, 3, 4)
    val list2 = listOf(3, 4, 5, 6)
    val list3 = listOf(4, 7, 8, 3)
    println(findCommonElements(list1, list2, list3))  // Output: [3, 4]
}