package foundation_kotlinPractice.day06

import kotlin.math.min

/*
각 query 마다 s <= i <= e인 모든 i에 대해 k보다 크면서 가장 작은 arr[i] 찾기
각 쿼리의 순서에 맞게 답을 저장한 배열 반환
특정 쿼리의 답이 존재하지 않으면 -1

e.g. [0, 4, 2]
arr[0] - arr[4] 사이에 있으면서, 2보다 크면서 가장 작은 값 = 3
 */

fun solution_(arr: IntArray, queries: Array<IntArray>): IntArray {
    var answer: IntArray = intArrayOf()

    queries.forEach { query ->
        val startIndex = query[0];
        val endIndex = query[1];
        val num = query[2];

        var minNum = 1000001
        (startIndex..endIndex)
            .asSequence()
            .filter { num < arr[it] }
            .forEach { minNum = min(minNum, arr[it]) }
        answer += if (minNum != 1000001) minNum else -1
    }

    return answer
}

/*
fun solution(arr: IntArray, queries: Array<IntArray>): IntArray = IntArray(queries.size) { i ->
    arr.slice(queries[i][0]..queries[i][1]).filter { it > queries[i][2] }.minOrNull() ?: -1
}
 */

fun main() {
    println(solution_(
        intArrayOf(0, 1, 2, 4, 3),
        arrayOf(intArrayOf(0, 4, 2), intArrayOf(0, 3, 2), intArrayOf(0, 2, 2))
    ).contentToString())
}