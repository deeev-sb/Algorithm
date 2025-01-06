package foundation_kotlinPractice.day03

fun solution(arr: Array<String>): String {
    return buildString {
        arr.forEach {
            append(it)
        }
    }
}

fun main() {
    println(solution(arrayOf("a", "b", "c")))
}
