package foundation_kotlinPractice.day13

fun solution__(num_list: IntArray, n: Int): IntArray = num_list.sliceArray(0..<n)

fun main() {
    println(solution__(intArrayOf(2, 1, 6), 1).contentToString()) // [2]
    println(solution__(intArrayOf(5, 2, 1, 7, 5), 3).contentToString()) // [5, 2, 1]
}