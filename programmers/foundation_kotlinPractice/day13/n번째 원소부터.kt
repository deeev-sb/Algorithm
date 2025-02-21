package foundation_kotlinPractice.day13

fun solution(num_list: IntArray, n: Int): IntArray
    = num_list.sliceArray(n - 1 .. num_list.lastIndex)

fun main() {
    println(solution(intArrayOf(2, 1, 6), 3).contentToString()) // [6]
    println(solution(intArrayOf(5, 2, 1, 7, 5), 2).contentToString()) // [2, 1, 7, 5]
}