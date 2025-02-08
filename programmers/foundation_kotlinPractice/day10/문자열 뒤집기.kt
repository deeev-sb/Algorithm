package foundation_kotlinPractice.day10

fun solution(my_string: String, s: Int, e: Int): String =
    my_string.substring(0, s) + my_string.substring(s, e + 1).reversed() + my_string.substring(e + 1)

fun main() {
    println(solution("Progra21Sremm3", 6, 12)) // ProgrammerS123
    println(solution("Stanley1yelnatS", 4, 10)) // Stanley1yelnatS
}