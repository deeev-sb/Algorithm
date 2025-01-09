package foundation_kotlinPractice.day04

fun solution(num: Int, n: Int): Int {
    return if (num % n == 0) 1 else 0
}

fun main() {
    println(solution(98, 2)) // 1
    println(solution(34, 3)) // 0
}