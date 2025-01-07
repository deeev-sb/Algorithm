package foundation_kotlinPractice.day03

fun solution(my_string: String, k: Int): String {
    return buildString {
        repeat(k) {
            append(my_string)
        }
    }
}

fun main() {
    println(solution("string", 3))
}
