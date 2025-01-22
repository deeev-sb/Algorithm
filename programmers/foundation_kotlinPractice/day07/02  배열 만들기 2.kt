package foundation_kotlinPractice.day07

import java.util.*


/*
l 이상 r 이하 정수 중 숫자 0과 5로만 이루어진 모든 정수를 오름차순으로 저장한 배열 return
없으면 -1이 담긴 배열 return
 */

fun solution(l: Int, r: Int): IntArray {
    val answer = mutableListOf<Int>()
    val queue: Queue<Int> = LinkedList()

    queue.add(5)

    while (queue.isNotEmpty()) {
        val curl = queue.poll()
        if (curl <= r) {
            if (curl >= l) {
                answer.add(curl)
            }
            val num1 = curl * 10
            val num2 = curl * 10 + 5

            if (num1 <= r) queue.add(num1)
            if (num2 <= r) queue.add(num2)
        }
    }

    return if (answer.isEmpty()) intArrayOf(-1) else answer.toIntArray()
}

/*
fun solution(l: Int, r: Int): List<Int> {
    return (l..r).filter { it.toString().all { ch -> ch == '0' || ch == '5' } }.takeIf(List<Int>::isNotEmpty) ?: listOf(-1)
}
 */

/*
fun solution(l: Int, r: Int): IntArray = (1..63)
    .map { it.toString(2).replace('1', '5').toInt() }
    .filter { it in l..r }
    .ifEmpty { listOf(-1) }
    .toIntArray()
 */

fun main() {
    println(solution(5, 555).contentToString())  // [5, 50, 55, 500, 505, 550, 555]
    println(solution(10, 20).contentToString()) // [-1]
}