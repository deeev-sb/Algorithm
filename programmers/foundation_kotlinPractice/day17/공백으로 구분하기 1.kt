package foundation_kotlinPractice.day17

fun solution(my_string: String): Array<String>
        = my_string.split(" ").toTypedArray()

fun main() {
    println(solution("i love you").contentToString()) // ["i", "love", "you"]
    println(solution("programmers").contentToString()) // ["programmers"]
}