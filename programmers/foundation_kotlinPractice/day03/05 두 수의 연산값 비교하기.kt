package foundation_kotlinPractice.day03

import kotlin.math.max

fun solution_(a: Int, b: Int): Int {
    return max("$a$b".toInt(), 2*a*b)
}

fun main() {
    println(solution_(2, 91)) // 364
    println(solution_(91, 2)) // 912
}