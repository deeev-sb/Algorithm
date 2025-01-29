package foundation_kotlinPractice.day08

/*
문자열 number 를 9로 나눈 나머지 return
 */

fun solution(number: String): Int = number.sumOf { it.digitToInt() } % 9


fun main() {
    println(solution("123")) // 6
    println(solution("78720646226947352489")) // 2
}