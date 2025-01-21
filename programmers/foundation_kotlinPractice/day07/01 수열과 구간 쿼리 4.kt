package foundation_kotlinPractice.day07

fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
    for (query in queries) {
        val startIndex = query[0];
        val endIndex = query[1];
        val num = query[2];

        (startIndex..endIndex)
            .filter { it % num == 0 }
            .forEach { arr[it] += 1 }
    }

    return arr
}

/*
fun solution(arr: IntArray, queries: Array<IntArray>): IntArray = arr.apply {
    queries.forEach { (s, e, k) -> (s..e).filter { it % k == 0 }.forEach { arr[it]++ } }
}
 */

fun main() {
    println(
        solution(
            intArrayOf(0, 1, 2, 4, 3),
            arrayOf(intArrayOf(0, 4, 1), intArrayOf(0, 3, 2), intArrayOf(0, 3, 3))
        ).contentToString()
    ) // [3, 2, 4, 6, 4]
}