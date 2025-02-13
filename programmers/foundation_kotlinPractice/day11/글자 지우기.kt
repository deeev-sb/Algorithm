package foundation_kotlinPractice.day11

fun solution(my_string: String, indices: IntArray): String =
    my_string.filterIndexed { index, _ -> index !in indices }


fun main() {
    println(solution("apporoograpemmemprs", intArrayOf(1, 16, 6, 15, 0, 10, 11, 3))) // programmers
}