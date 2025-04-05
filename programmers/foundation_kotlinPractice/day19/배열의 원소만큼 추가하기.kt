package foundation_kotlinPractice.day19

fun solution2(arr: IntArray): IntArray {
    val result = mutableListOf<Int>()
    arr.map { for (i in 1..it) result.add(it) }
    return result.toIntArray()
}

fun main() {
    println(solution2(intArrayOf(3, 1, 2, 4)).contentToString()) // [3, 3, 3, 1, 2, 2, 4, 4, 4, 4]
    println(solution2(intArrayOf(5, 1)).contentToString()) // [5, 5, 5, 5, 5, 1]
    println(solution2(intArrayOf()).contentToString()) // []
}

//fun solution(arr: IntArray): IntArray {
//    return arr.flatMap { n -> IntArray(n) { n }.toList() }.toIntArray()
//}

//fun solution(arr: IntArray): List<Int> {
//    return arr.flatMap { i -> List(i) { i } }
//}