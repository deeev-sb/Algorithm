package foundation_kotlinPractice.day04

fun solution(a: Int, b: Int, flag: Boolean): Int =
    if (flag) a + b else a - b

fun main() {
    println(solution(-4, 7, true)) // 3
    println(solution(-4, 7, false)) // -11
}