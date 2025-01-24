package foundation_kotlinPractice.day07

import java.util.*

/*
콜라츠 문제란?
모든 자연수 x에 대해서 현재 값이 x이면,
x가 짝수 일때는 2로 나누고
x가 홀수 일 대는 3 * x + 1로 바꾸는 계산을 반복하면
반드시 x가 1이 되는지 묻는 문제
---
초기값이 n인 콜라츠 수열 return
 */

fun solution(n: Int): IntArray {
    val answer = mutableListOf<Int>()
    val queue = LinkedList<Int>()
    queue.offer(n)

    while (true) {
        val curl = queue.poll()
        answer.add(curl)
        if (curl == 1) break
        if (curl % 2 == 0) queue.offer(curl / 2)
        else queue.offer(3 * curl + 1)
    }

    return answer.toIntArray()
}

/*
fun solution(n: Int): List<Int> {
    return generateSequence(n) { if (it == 1) null else if (it % 2 == 0) it / 2 else 3 * it + 1 }.toList()
}
 */

/*
fun solution(n: Int): IntArray = collatz(n, intArrayOf(n))
tailrec fun collatz(n: Int, arr: IntArray): IntArray = if(n == 1) arr else if(n % 2 == 0) collatz(n / 2, arr.plus(n / 2)) else collatz(3 * n + 1, arr.plus(3 * n + 1))
 */

fun main() {
    println(solution(10).contentToString())
}