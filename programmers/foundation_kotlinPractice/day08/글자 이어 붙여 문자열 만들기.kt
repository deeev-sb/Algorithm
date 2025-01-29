package foundation_kotlinPractice.day08

/*
my_string의 index_list의 원소들에 해당하는 인덱스의 글자들을
순서대로 이어 붙인 문자열을 return
 */

fun solution(myString: String, indexList: IntArray): String = indexList.joinToString("") { myString[it].toString() }

fun main() {
    println(
        solution("cvsgiorszzzmrpaqpe",
            intArrayOf(16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7)
        ) // programmers
    )
    println(
        solution("zpiaz",
            intArrayOf(1, 2, 0, 0, 3)
        ) // pizza
    )
}