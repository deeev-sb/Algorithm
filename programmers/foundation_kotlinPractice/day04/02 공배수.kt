package foundation_kotlinPractice.day04

fun solution(number: Int, n: Int, m: Int): Int {
    return if (number % n == 0 && number % m == 0) 1 else 0
}

fun main() {
    println(solution(60, 2, 3)) // 1
    println(solution(55, 10, 5)) // 0
}