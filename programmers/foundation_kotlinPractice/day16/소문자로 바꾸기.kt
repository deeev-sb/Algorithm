package foundation_kotlinPractice.day16

fun solution2(myString: String): String
    = myString.lowercase()

fun main() {
    println(solution2("aBcDeFg")) // abcdefg
    println(solution2("aaa")) // aaa
}