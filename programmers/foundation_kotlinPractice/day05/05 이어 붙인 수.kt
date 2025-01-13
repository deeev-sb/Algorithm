package foundation_kotlinPractice.day05

/*
홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합 반환
 */

fun solution_(numList: IntArray): Int = numList.filter { it % 2 == 0 }.fold(0) { acc, i -> acc * 10 + i } +
        numList.filter { it % 2 != 0 }.fold(0) { acc, i -> acc * 10 + i }

/*
- filter 로 짝수/홀수만 추출
- fold 사용해서 초기 값을 0으로 설정
 */

fun main() {
    println(solution_(intArrayOf(3, 4, 5, 2, 1))) // 393
    println(solution_(intArrayOf(5, 7, 8, 3))) // 581
}
