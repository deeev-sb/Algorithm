package foundation_kotlinPractice.day10

fun solution(my_string: String, is_prefix: String): Int =
    if (my_string.startsWith(is_prefix)) 1 else 0

fun main() {
    println(solution("banana", "ban")) // 1
    println(solution("banana", "nan")) // 0
    println(solution("banana", "abcd")) // 0
    println(solution("banana", "bananan")) // 0
}
