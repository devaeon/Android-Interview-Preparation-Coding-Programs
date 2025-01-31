package com.android.interview.preparation.programs

fun main(){
    val numbers = listOf(1, 2, 3, 4, 5, 2, 3, 6)
    println(findDuplicates(numbers))  // Output: [2, 3]
}

private fun findDuplicates(list:List<Int>): Set<Int> {
    val seen = mutableSetOf<Int>()
    val duplicate = mutableSetOf<Int>()

    list.forEach {
        if(seen.add(it).not()){
            duplicate.add(it)
        }
    }
    return duplicate
}