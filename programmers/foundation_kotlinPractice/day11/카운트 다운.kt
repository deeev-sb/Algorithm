package foundation_kotlinPractice.day11

fun solution_(start_num: Int, end_num: Int): IntArray
    = (start_num downTo end_num).toList().toIntArray()

fun main() {
    println(solution_(10, 3).contentToString()) // [10, 9, 8, 7, 6, 5, 4, 3]
}
