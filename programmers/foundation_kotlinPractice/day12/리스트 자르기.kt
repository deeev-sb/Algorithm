package foundation_kotlinPractice.day12

fun solution(n: Int, slicer: IntArray, num_list: IntArray): IntArray {
    return when (n) {
        1 -> num_list.slice(0..slicer[1]).toIntArray()
        2 -> num_list.slice(slicer[0] until num_list.size).toIntArray()
        3 -> num_list.slice(slicer[0]..slicer[1]).toIntArray()
        4 -> num_list.slice(slicer[0]..slicer[1] step slicer[2]).toIntArray()
        else -> intArrayOf()
    }
}

fun main() {
    println(solution(3, intArrayOf(1, 5, 2), intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)).contentToString()) // [2, 3, 4, 5, 6]
    println(solution(4, intArrayOf(1, 5, 2), intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)).contentToString()) // [2, 4, 6]
}