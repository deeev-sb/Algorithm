package foundation_kotlinPractice.day15

fun solution4(num_list: IntArray): Int =
    if (num_list.size > 10) num_list.sum() else num_list.reduce { acc, i -> acc * i }

fun main() {
    println(solution4(intArrayOf(3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1))) // 51
    println(solution4(intArrayOf(2, 3, 4, 5))) // 120
}