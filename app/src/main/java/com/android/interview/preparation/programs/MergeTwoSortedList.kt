package com.android.interview.preparation.programs


fun main() {

    val list1 = listOf(1, 3, 5, 7, 9, 11, 13)
    val list2 = listOf(2, 4, 6, 8, 10, 12, 14)

    println(mergeSortedLists(list1, list2))
}

// less efficient in case when list is already sorted
private fun mergeTwoListAndSort(list1: List<Int>, list2: List<Int>): List<Int> {
    return (list1 + list2).sorted()

}

// recommended way
private fun mergeTwoSortedList(list1: List<Int>, list2: List<Int>): List<Int> {
    val result = mutableListOf<Int>()

    var i = 0
    var j = 0

    while (i < list1.size && j < list2.size) {
        if (list1[i] < list2[j]) {
            result.add(list1[i++])
        } else result.add(list2[j++])
    }

    while (i < list1.size) result.add(list1[i++])
    while (j < list2.size) result.add(list2[j++])

    return result
}

fun mergeSortedLists(list1: List<Int>, list2: List<Int>): List<Int> {
    return sequence {
        val iterator1 = list1.iterator()
        val iterator2 = list2.iterator()
        var a = if (iterator1.hasNext()) iterator1.next() else null
        var b = if (iterator2.hasNext()) iterator2.next() else null

        while (a != null || b != null) {
            when {
                a == null -> {
                    yield(b!!)
                    b = if (iterator2.hasNext()) iterator2.next() else null
                }

                b == null -> {
                    yield(a)
                    a = if (iterator1.hasNext()) iterator1.next() else null
                }

                a < b -> {
                    yield(a);
                    a = if (iterator1.hasNext()) iterator1.next() else null
                }

                else -> {
                    yield(b);
                    b = if (iterator2.hasNext()) iterator2.next() else null
                }
            }
        }
    }.toList()
}