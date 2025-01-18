package foundation_kotlinPractice.day06

/* 초기 코드
fun solution_(numLog: IntArray): String {
    var result = ""
    for (i in 1 until numLog.size) {
        val num = numLog[i - 1];
        val nextNum = numLog[i];
        result += when (nextNum - num) {
            1 -> "w"
            -1 -> "s"
            10 -> "d"
            -10 -> "a"
            else -> {}
        }
    }
    return result
}
 */

fun solution_(numLog: IntArray): String {
    val sb = StringBuilder()
    for (i in 1 until numLog.size) {
        when (numLog[i] - numLog[i - 1]) {
            1 -> sb.append("w")
            -1 -> sb.append("s")
            10 -> sb.append("d")
            -10 -> sb.append("a")
        }
    }
    return sb.toString()
}

/* zipWithNext 를 이용한 방법
fun solution(numLog: IntArray): String {
    return numLog
        .zipWithNext() // (prev, next) 쌍을 만들어줌
        .joinToString(separator = "") { (prev, next) ->
            when (next - prev) {
                1 -> "w"
                -1 -> "s"
                10 -> "d"
                -10 -> "a"
                else -> "" // 혹은 에러 핸들링
            }
        }
}
 */

fun main() {
    println(solution_(intArrayOf(0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1))) // wsdawsdassw
}