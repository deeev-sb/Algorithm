package foundation_kotlinPractice.day08

/*
queries[s,e]는 my_string 인덱스 s부터 e까지 뒤집으라는 으미
 */

fun solution(my_string: String, queries: Array<IntArray>): String {
    val sb = StringBuilder(my_string)
    queries.forEach { (start, end) -> sb.replace(start, end + 1, sb.substring(start, end + 1).reversed()) }
    return sb.toString()
}


fun main() {
    println(
        solution(
            "rermgorpsam",
            arrayOf(intArrayOf(2, 3), intArrayOf(0, 7), intArrayOf(5, 9), intArrayOf(6, 10))
        )
    ) // programmers
}