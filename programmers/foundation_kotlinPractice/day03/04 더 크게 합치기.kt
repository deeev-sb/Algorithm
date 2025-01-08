package foundation_kotlinPractice.day03

import kotlin.math.max

fun solution(a: Int, b: Int): Int {
    return max("$a$b".toInt(), "$b$a".toInt())
}

fun main() {
    println(solution(9, 91)) // 991
    println(solution(89, 8)) // 898
}