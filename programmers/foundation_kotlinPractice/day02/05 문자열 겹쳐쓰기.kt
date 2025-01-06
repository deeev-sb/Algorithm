package foundation_kotlinPractice.day02


fun solution(my_string: String, overwrite_string: String, s: Int): String {
    return my_string.substring(0,s) + overwrite_string + my_string.substring(overwrite_string.length + s)
}

fun main() {
    println(solution("He11oWor1d", "lloWorl", 2))
    println(solution("Program29b8UYP", "merS123", 7))
}