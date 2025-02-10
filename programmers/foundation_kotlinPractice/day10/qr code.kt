package foundation_kotlinPractice.day10

/*
두 정수 q, r과 문자열 code 가 주어질 때,
code의 각 인덱스를 q로 나누었을 때 나머지가 r인 위치의 문자를
앞에서부터 순서대로 이어 붙인 문자열을 return
 */

fun solution(q: Int, r: Int, code: String): String =
    code.chunked(q).filter { it.length > r }.map {it[r] }.joinToString("")

fun main() {
    println(solution(3, 1, "qjnwezgrpirldywt")) // jerry
    println(solution(1, 0, "programmers")) // programmers
}