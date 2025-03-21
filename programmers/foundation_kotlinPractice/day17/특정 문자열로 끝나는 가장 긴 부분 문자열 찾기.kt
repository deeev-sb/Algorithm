package foundation_kotlinPractice.day17

fun solution(myString: String, pat: String): String = myString.substring(0, myString.lastIndexOf(pat) + pat.length)

fun main() {
    println(solution("AbCdEFG", "dE")) // "AbCdE"
    println(solution("AAAAaaaa", "a")) // "AAAAaaaa"
}