package com.android.interview.preparation.programs

fun main(){
    val list = listOf(1, 3, 2, 3, 4, 3, 1, 2, 3)
    val stringList = listOf("apple", "banana", "apple", "orange", "banana", "apple")

    println(mostFrequentElement(list)) // Output: 4
    println(mostFrequentElement2(stringList))
}

fun <T : Any> mostFrequentElement(list: List<T>): T? {
    return list.groupingBy {   it }.eachCount().maxByOrNull { it.value }?.key
}

fun <T : Any> mostFrequentElement2(list: List<T>): T? {
    val frequencyMap = list.groupBy { it }.mapValues { it.value.size }
    return frequencyMap.maxByOrNull { it.value }?.key
}