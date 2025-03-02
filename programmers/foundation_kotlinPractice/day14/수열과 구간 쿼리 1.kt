package foundation_kotlinPractice.day14

fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
    for (query in queries) {
        for (i in (query[0] .. query[1])) {
            arr[i] += 1
        }
    }

    return arr
}

/* 아래 방법이 좀 더 깔끔해보임
fun solution(arr: IntArray, queries: Array<IntArray>) = arr.apply {
    queries.forEach { (s, e) -> (s..e).forEach { arr[it]++ } }
}
 */

fun main() {
    println(solution(intArrayOf(0, 1, 2, 3, 4),
        arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(2, 3))
    ).contentToString())
}