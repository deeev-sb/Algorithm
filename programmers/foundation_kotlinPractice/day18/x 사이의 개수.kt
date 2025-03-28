package foundation_kotlinPractice.day18

fun solution(myString: String): IntArray
    = myString.split("x").map { it.length }.toIntArray()

fun main() {
    println(solution("oxooxoxxox").contentToString()) // [1, 2, 1, 0, 1, 0]
    println(solution("xabcxdefxghi").contentToString()) // [0, 3, 3, 3]
}