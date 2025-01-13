package foundation_kotlinPractice.day05

/*
모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1 크면 0 반환
 */

fun solution(numList: IntArray): Int =
    if (numList.reduce { acc, num -> acc * num } < numList.sum() * numList.sum()) 1 else 0
// reduce 는 첫 번째 원소를 초기 값으로 사용함

fun main() {
    println(solution(intArrayOf(3, 4, 5, 2, 1))) // 1
    println(solution(intArrayOf(5, 7, 8, 3))) // 0
}