package foundation_kotlinPractice.day16

fun solution(my_string: String, alp: String): String
    = my_string.replace(alp, alp.uppercase())

fun main() {
    println(solution("programmers", "p")) // "Programmers"
    println(solution("lowercase", "x")) // "lowercase"
}