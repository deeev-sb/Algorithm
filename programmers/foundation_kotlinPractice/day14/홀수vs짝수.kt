package foundation_kotlinPractice.day14

import kotlin.math.max

fun solution(num_list: IntArray): Int = max(
    num_list.slice(0..num_list.lastIndex step 2).sum(),
    num_list.slice(1..num_list.lastIndex step 2).sum()
)

fun main() {
    println(solution(intArrayOf(4, 2, 6, 1, 7, 6))) // 17
    println(solution(intArrayOf(-1, 2, 5, 6, 3))) // 8
}