package com.android.interview.preparation.programs


fun main(){
    val list1 = listOf(1, 2, 3, 4, 5)
    val list2 = listOf(3, 4, 5, 6, 7)
    println(findIntersection(list1, list2)) // Output: [3, 4, 5]
}

/*
*  Problem: Find common elements between two lists.
*  Approach: Convert one list to a Set for quick lookup.
* */
private fun findIntersection(list1:List<Int>, list2:List<Int>): List<Int> {
   return list1.intersect(list2.toSet()).toList()

}