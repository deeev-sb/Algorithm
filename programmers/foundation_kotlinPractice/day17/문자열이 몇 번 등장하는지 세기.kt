package foundation_kotlinPractice.day17

fun solution2(myString: String, pat: String): Int
        = myString.windowed(pat.length).count { it == pat }

fun main() {
    println(solution2("banana", "ana")) // 2
    println(solution2("aaaa", "aa")) // 3
}