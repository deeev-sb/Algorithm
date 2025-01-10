package foundation_kotlinPractice.day04

fun solution(ineq: String, eq: String, n: Int, m: Int): Int =
    if (ineq == "<" && eq == "=" && n <= m) 1
    else if (ineq == "<" && eq == "!" && n < m) 1
    else if (ineq == ">" && eq == "=" && n >= m) 1
    else if (ineq == ">" && eq == "!" && n > m) 1
    else 0

fun main() {
    println(solution("<", "=", 20, 50)) // 1
    println(solution(">", "!", 41, 78)) // 0
}

/* 다른 사람 풀이 1
fun solution(ineq: String, eq: String, n: Int, m: Int): Int {
    return when {
        ineq == "<" && eq == "=" -> n <= m
        ineq == "<" && eq == "!" -> n < m
        ineq == ">" && eq == "=" -> n >= m
        ineq == ">" && eq == "!" -> n > m
        else -> false
    }.let { if (it) 1 else 0 }
}
 */

/* 다른 사람 풀이 2
fun solution(ineq: String, eq: String, n: Int, m: Int): Int =
    when ("$ineq$eq") {
        ">=" -> n >= m
        "<=" -> n <= m
        ">!" -> n > m
        else -> n < m
    }.compareTo(false)
 */