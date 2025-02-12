package foundation_kotlinPractice.day11

fun solution(n: Int, k: Int): IntArray = (k..n step k).toList().toIntArray()

fun main() {
    println(solution(10, 3).contentToString()) // [3, 6, 9]
    println(solution(15, 5).contentToString()) // [5, 10, 15]
}