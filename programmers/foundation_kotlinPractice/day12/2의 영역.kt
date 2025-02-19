package foundation_kotlinPractice.day12

fun solution_(arr: IntArray): IntArray
    = if (arr.indexOfFirst { it == 2 } == -1) intArrayOf(-1)
        else arr.slice(arr.indexOfFirst { it == 2 } ..arr.indexOfLast { it == 2 }).toIntArray()

fun main() {
    println(solution_(intArrayOf(1, 2, 1, 4, 5, 2, 9)).contentToString()) // [2, 1, 4, 5, 2]
    println(solution_(intArrayOf(1, 2, 1)).contentToString()) // [2]
    println(solution_(intArrayOf(1, 1, 1)).contentToString()) // [-1]
    println(solution_(intArrayOf(1, 2, 1, 2, 1, 10, 2, 1)).contentToString()) // [2, 1, 2, 1, 10, 2]
}