package com.android.interview.preparation.programs

data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }

    operator fun minus(other: Point):Point{
        return Point(x-other.x,y-other.y)
    }
}

fun main() {
    val p1 = Point(3, 4)
    val p2 = Point(2, 7)

    val result = p1 + p2  // Calls operator fun plus()
    println(result)  // Output: Point(x=5, y=11)
}
