package foundation_kotlinPractice.day17

fun solution(strArr: Array<String>): Array<String>
        = strArr.filterNot {it.contains("ad")}.toTypedArray()

fun main() {
    println(solution(arrayOf("and", "notad", "abcd")).contentToString()) // ["and","abcd"]
    println(solution(arrayOf("there", "are", "no", "a", "ds")).contentToString()) // ["there","are","no","a","ds"]
}