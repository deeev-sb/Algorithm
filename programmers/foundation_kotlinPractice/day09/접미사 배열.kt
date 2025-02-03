package foundation_kotlinPractice.day09

fun solution(my_string: String): Array<String> = my_string.indices
    .map { my_string.substring(it) }
    .sorted().toTypedArray()

fun main() {
    println(solution("banana").contentToString())
    // ["a", "ana", "anana", "banana", "na", "nana"]

    println(solution("programmers").contentToString())
    // ["ammers", "ers", "grammers", "mers", "mmers", "ogrammers", "programmers", "rammers", "rogrammers", "rs", "s"]
}
