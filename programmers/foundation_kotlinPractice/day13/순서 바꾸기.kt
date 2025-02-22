package foundation_kotlinPractice.day13

fun solution_(num_list: IntArray, n: Int): IntArray =
    num_list.sliceArray(n..num_list.lastIndex) + num_list.sliceArray(0..<n)

/* 프로그래머스에서 ..< 미동작으로 다음과 같이 제출
fun solution_(num_list: IntArray, n: Int): IntArray =
    num_list.sliceArray(n..num_list.lastIndex) + num_list.sliceArray(0..n+1)
 */

fun main() {
    println(solution_(intArrayOf(2, 1, 6), 1).contentToString()) // [1, 6, 2]
    println(solution_(intArrayOf(5, 2, 1, 7, 5), 3).contentToString()) // [7, 5, 5, 2, 1]
}