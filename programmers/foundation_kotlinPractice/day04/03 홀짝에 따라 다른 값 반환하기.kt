package foundation_kotlinPractice.day04

// n이 홀수면 n 이하의 홀수인 모든 양의 정수 합 return
// n이 짝수면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return
fun solution(n: Int): Int {
    var answer = 0
    if (n % 2 == 0) {
        for (i in 2 .. n step 2) {
            answer += i * i
        }
    } else {
        for (i in 1 .. n step 2) {
            answer += i
        }
    }

    return answer
}

fun main() {
    println(solution(7)) // 16
    println(solution(10)) // 220
}

/* 다른 사람 풀이 1
fun solution(n: Int): Int =
    if (n % 2 == 0) (n downTo 2 step 2).sumOf { it * it }
    else (n downTo 1 step 2).sum()
 */

/* 다른 사람 풀이 2
fun solution(n: Int): Int =
    if (n % 2 == 0) {
        (2..n step 2).fold(0) { acc, i -> acc + (i * i) }
    } else {
        (1..n step 2).fold(0) { acc, i -> acc + i }
    }
 */