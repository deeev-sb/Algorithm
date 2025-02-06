package foundation_kotlinPractice.day10

fun solution(my_string: String, n: Int): String
    = my_string.substring(0, n)

fun main() {
    println(solution("ProgrammerS123", 11)) // "ProgrammerS"
    println(solution("He110W0r1d", 5)) // "He110"
}