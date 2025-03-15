package foundation_kotlinPractice.day16

fun solution(myString: String): String
    = myString.uppercase()

fun main() {
    println(solution("aBcDeFg")) // ABCDEFG
    println(solution("AAA")) // AAA
}