package foundation_kotlinPractice.day09

/*
my_string 뒤의 n 글자로 이루어진 문자열 반환
 */

fun solution(my_string: String, n: Int): String = my_string.substring(my_string.length - n)

fun main() {
    println(
        solution("ProgrammerS123", 11)
    ) // grammerS123
    println(
        solution("He110W0r1d", 5)
    ) // W0r1d
}