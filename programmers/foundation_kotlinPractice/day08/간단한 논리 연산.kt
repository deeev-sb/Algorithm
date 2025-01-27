package foundation_kotlinPractice.day08

fun solution(x1: Boolean, x2: Boolean, x3: Boolean, x4: Boolean): Boolean
= ((x1 or x2) and (x3 or x4))


fun main() {
    println(
        solution(false, true, true, true)
    ) // true

    println(
        solution(true, false, false, false)
    ) // false
}