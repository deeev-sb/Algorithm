package foundation_kotlinPractice.day10

/*
my_string 을 한 줄에 m 글자씩 가로로 적었을 때 왼쪽부터 세로로 c번째 열에 적힌 글자들을 문자열로 return
 */

fun solution_(my_string: String, m: Int, c: Int): String {
    var index = 0
    val answer = StringBuilder()
    while(index < my_string.length) {
        val str = my_string.substring(index, index + m)
        answer.append(str[c - 1])
        index += m
    }
    return answer.toString()
}

/*
fun solution(myString: String, m: Int, c: Int) =
    myString.chunked(m).map { it[c - 1] }.joinToString("")
}
 */

fun main() {
    println(solution_("ihrhbakrfpndopljhygc", 4, 2)) // happy
    println(solution_("programmers", 1, 1)) // programmers
}