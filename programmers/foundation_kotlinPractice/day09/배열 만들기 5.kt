package foundation_kotlinPractice.day09

/*
intStrs 각 원소마다 s번 인덱스에서 길이 l짜리 부분 문자열을 잘라 정수로 변환
이 때 변환한 정수 값이 k보다 큰 값들을 배열에 담아 return
 */

fun solution(intStrs: Array<String>, k: Int, s: Int, l: Int): IntArray = intStrs
    .asSequence()
    .map { it.substring(s, s + l).toInt() }
    .filter { it > k }
    .toList()
    .toIntArray()

fun main() {
    println(
        solution(arrayOf("0123456789","9876543210","9999999999999"), 50000, 5, 5)
            .contentToString()
    ) // [56789, 99999]
}