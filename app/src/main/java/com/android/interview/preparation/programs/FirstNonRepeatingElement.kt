package com.android.interview.preparation.programs


fun main(){
    val numbers = listOf(4, 5,23, 1, 2, 0, 4, 5, 2)
    println(firstNonRepeatingElement(numbers))  // Output: 1
}

//we will use LinkedHashMap for that
private fun firstNonRepeatingElement(list:List<Int>): Int? {

    val countMap= LinkedHashMap<Int,Int>()
    list.forEach {
        println("countMap: $countMap")
        countMap[it]=countMap.getOrDefault(it,0)+1
    }

    return countMap.entries.firstOrNull { it.value==1 }?.key

}