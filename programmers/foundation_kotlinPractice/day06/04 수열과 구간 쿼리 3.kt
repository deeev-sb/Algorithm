package foundation_kotlinPractice.day06

/*
queries의 원소는 각각 하나의 query를 나타냄 `[i, j]`
각 query 마다 순서대로 arr[i], arr[j] 값을 서로 바꿈
 */

fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
    for (query in queries) {
        val i = query[0]
        val j = query[1]
        val temp = arr[i]
        arr[i] = arr[j]
        arr[j] = temp
    }
    return arr
}

/*
fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
    queries.forEach { (first, second) ->
        arr[first] = arr[second].also { arr[second] = arr[first] }
    }
    return arr
}
 */

fun main() {
    println(
        solution(
            intArrayOf(0, 1, 2, 3, 4),
            arrayOf(intArrayOf(0, 3), intArrayOf(1, 2), intArrayOf(1, 4))
        ).contentToString()
    ) // [3, 4, 1, 0, 2]
}