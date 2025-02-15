package foundation_kotlinPractice.day11

fun solution(arr: IntArray, idx: Int): Int = (idx..arr.lastIndex).firstOrNull { arr[it] == 1 } ?: -1

fun main() {
    println(solution(intArrayOf(0, 0, 0, 1), 1)) // 3
    println(solution(intArrayOf(1, 0, 0, 1, 0, 0), 4)) // -1
    println(solution(intArrayOf(1, 1, 1, 1, 0), 3)) // 3
}