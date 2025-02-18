package foundation_kotlinPractice.day12

/*
arr 의 첫 번째 구간에 해당하는 배열
+ 두 번째 구간에 해당하는 배열
 */

fun solution(arr: IntArray, intervals: Array<IntArray>): IntArray
    = arr.slice(intervals[0][0]..intervals[0][1]).toIntArray()
    .plus(arr.slice(intervals[1][0]..intervals[1][1]).toIntArray())

/*
fun solution(arr: IntArray, intervals: Array<IntArray>): IntArray
        = intervals.flatMap { (left, right) -> arr.slice(left..right) }.toIntArray()
 */

fun main() {
    println(solution(intArrayOf(1, 2, 3, 4, 5),
        arrayOf(intArrayOf(1, 3), intArrayOf(0, 4))).contentToString())
    // [2, 3, 4, 1, 2, 3, 4, 5]
}