package foundation_kotlinPractice.day15

fun solution(myString: String, pat: String): Int
    = if (myString.lowercase().contains(pat.lowercase())) 1 else 0

fun main() {
    println(solution("AbCdEfG", "aBc")) // 1
    println(solution("aaAA", "aaaaa")) // 0
}