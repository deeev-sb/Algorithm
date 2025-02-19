package foundation_kotlinPractice.day12

fun solution(arr: IntArray, query: IntArray): IntArray {
    var result = arr

    query.forEachIndexed { index, i ->
        result = if (index % 2 == 0) {
            result.copyOfRange(0, i + 1)
        } else {
            result.copyOfRange(i, result.size)
        }
    }

    return result
}

fun main() {
    println(solution(intArrayOf(0, 1, 2, 3, 4, 5), intArrayOf(4, 1, 2)).contentToString()) // [1, 2, 3]
}