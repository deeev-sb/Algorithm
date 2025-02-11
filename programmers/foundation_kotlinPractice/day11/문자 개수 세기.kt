package foundation_kotlinPractice.day11

/*
알파벳 대소문자로만 이루어진 문자열이
 */

fun solution(my_string: String): IntArray {
    val answer = IntArray(52)
    my_string.forEach {
        if (it.isUpperCase()) answer[it - 'A']++
        else answer[it - 'a' + 26]++
    }
    return answer
}

fun main() {
    println(solution("Programmers").contentToString())
    // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 2, 0, 1, 0, 0, 3, 1, 0, 0, 0, 0, 0, 0, 0]
}