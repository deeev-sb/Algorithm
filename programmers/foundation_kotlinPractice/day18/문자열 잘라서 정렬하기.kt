package foundation_kotlinPractice.day18

fun solution2(myString: String): Array<String> =
    myString.split("x").filterNot { it.isBlank() }.sorted().toTypedArray()
// myString.split("x".toRegex()).filter(String::isNotEmpty).sorted().toTypedArray()

fun main() {
    println(solution2("axbxcxdx").contentToString()) // ["a","b","c","d"]
    println(solution2("dxccxbbbxaaaa").contentToString()) // ["aaaa","bbb","cc","d"]
}