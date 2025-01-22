package foundation_kotlinPractice.day07

fun solution_(start_num: Int, end_num: Int): IntArray = (start_num..end_num).toList().toIntArray()


fun main() {
    println(solution_(3, 10).contentToString()) // [3, 4, 5, 6, 7, 8, 9, 10]
}