package foundation_kotlinPractice.day16

fun solution(strArr: Array<String>): Array<String>
    = strArr.mapIndexed { index, s -> if (index % 2 == 0) s.lowercase() else s.uppercase() }.toTypedArray()

fun main() {
    println(solution(arrayOf("AAA", "BBB", "CCC", "DDD")).contentToString()) // ["aaa","BBB","ccc","DDD"]
    println(solution(arrayOf("aBc", "AbC")).contentToString()) // ["abc","ABC"]
}