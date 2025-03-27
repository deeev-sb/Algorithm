package foundation_kotlinPractice.day17

fun solution2(my_string: String): Array<String>
    = my_string.split(" ").filterNot { it.isEmpty() }.toTypedArray()

fun main() {
    println(solution2(" i    love  you").contentToString()) // ["i", "love", "you"]
    println(solution2("    programmers  ").contentToString()) // ["programmers"]
}