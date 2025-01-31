package com.android.interview.preparation.programs

fun main() {

    val list = mutableListOf(3,8,5,9,0,53,5, 13)
    println(reverseListRecursive(list))
}

/*
*  Problem: Reverse a list manually.
*  Approach: Swap elements.
* */
private fun reverseList(array: MutableList<Int>): List<Int> {
    var start = 0
    var end = array.size - 1

    while (start < end) {
        println("Start: ${array[start]}, end: ${array[end]}")
        array[start] = array[end].also {
            array[end]= array[start]

        }
        start++
        end--
    }

    return array
}

private fun reverseListThroughNewIteration(list:List<Int>): List<Int> {

    val newList= mutableListOf<Int>()
    for (i in list.indices.reversed()){
        newList.add(list[i])
    }
    return newList
}

private fun reverseListRecursive(list: List<Int>): List<Int> {
    if (list.size<=1) return list
    return listOf(list.last()) + reverseListRecursive(list.dropLast(1))

}