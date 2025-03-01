package foundation_kotlinPractice.day14

fun solution(numbers: IntArray, n: Int): Int {
    var answer = 0

    for (i in numbers.indices) {
        answer += numbers[i]
        if (answer > n) break
    }

    return answer
}

fun main() {
    println(solution(intArrayOf(34, 5, 71, 29, 100, 34), 123)) // 139
    println(solution(intArrayOf(58, 44, 27, 10, 100), 139)) // 149
}