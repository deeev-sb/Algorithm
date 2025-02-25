package foundation_kotlinPractice.day13

fun solution___(num_list: IntArray, n: Int): IntArray
    = num_list.slice(0 .. num_list.lastIndex step n).toIntArray()

fun main() {
    println(solution___(intArrayOf(4, 2, 6, 1, 7, 6), 2).contentToString()) // [4, 6, 7]
    println(solution___(intArrayOf(4, 2, 6, 1, 7, 6), 4).contentToString()) // [4, 7]
}