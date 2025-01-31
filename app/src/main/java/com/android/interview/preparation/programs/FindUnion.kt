package com.android.interview.preparation.programs


fun main(){
    val list1 = listOf(1, 2, 3, 4, 5)
    val list2 = listOf(3, 4, 5, 6, 7)
    println(findUnion(list1, list2)) // Output: [1, 2, 3, 4, 5, 6, 7]
}

/*
*  Problem: Get a combination of list without duplicates.
*  Approach: Use set to remove duplicates.
* */
private fun findUnion(list1:List<Int>, list2:List<Int>): List<Int> {
   return ((list1+list2).toSet()).toList()

}