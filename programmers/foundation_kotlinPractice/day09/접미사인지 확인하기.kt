package foundation_kotlinPractice.day09

/*
`is_suffix`가 `my_string₩의 접미사면 1, 아니면 0
 */

fun solution(my_string: String, is_suffix: String): Int =
    if (my_string.indices.any { my_string.substring(it) == is_suffix }) 1 else 0


fun main() {
    println(solution("banana", "ana")) // 1
    println(solution("banana", "nan")) // 0
    println(solution("banana", "wxyz")) // 0
    println(solution("banana", "abanana")) // 0
}