package foundation_kotlinPractice.day09

/*
parts[i] 는 [s,e] 형태
my_string[i]의 인덱스 s부터 e까지 부분 문자열을 순서대로 이어 붙여 반환
 */
fun solution(my_strings: Array<String>, parts: Array<IntArray>): String =
    buildString { for (i in my_strings.indices) append(my_strings[i].substring(parts[i][0], parts[i][1] + 1)) }

fun main() {
    println(
        solution(
            arrayOf("progressive", "hamburger", "hammer", "ahocorasick"),
            arrayOf(intArrayOf(0, 4), intArrayOf(1, 2), intArrayOf(3, 5), intArrayOf(7, 7))
        )
    ) // programmers
}

/*
fun solution(myStrings: Array<String>, parts: Array<IntArray>): String {
    return myStrings.indices.joinToString("") { myStrings[it].substring(parts[it][0], parts[it][1] + 1) }
}
 */

/*
fun solution(my_strings: Array<String>, parts: Array<IntArray>): String = my_strings.mapIndexed {i, v -> v.slice(parts[i][0]..parts[i][1])}.joinToString("")
 */