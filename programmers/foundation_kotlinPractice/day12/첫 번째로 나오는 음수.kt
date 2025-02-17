package foundation_kotlinPractice.day12

//첫 번째로 나오는 음수의 인덱스를 return
fun solution(num_list: IntArray): Int = num_list.indexOfFirst { it < 0 }

fun main() {
    println(solution(intArrayOf(12, 4, 15, 46, 38, -2, 15))) // 5
    println(solution(intArrayOf(13, 22, 53, 24, 15, 6))) // -1
}