package foundation_kotlinPractice.day05

/*
code 앞에서부터 읽으면서 문자가 1이면, mode 변경
mode 에 따라 code 읽어가면서 문자열 ret 생성

- mode == 0
    - code[idx] != 1 : idx 가 짝수일 때만 ret 맨 뒤에 code[idx] 추가
    - code[idx] == 1 : mode 변경 (0 -> 1)
- mode == 1
    - code[idx] != 1 : idx 가 홀수일 때만 ret 맨 뒤에 code[idx] 추가
    - code[idx] == 1 : mode 변경 (1 -> 0)

시작할 때 mode = 0
return 하려는 ret 이 빈 문자열이면 "EMPTY" return
 */

fun solution(code: String): String {
    var mode = 0
    var ret = ""
    for (idx in code.indices) when {
        code[idx] == '1' -> mode = if (mode == 0) 1 else 0
        else -> if (mode == 0 && idx % 2 == 0)
            ret += code[idx]
        else if (mode == 1 && idx % 2 == 1)
            ret += code[idx]
    }

    return ret.ifBlank { "EMPTY" }
}

fun main() {
    println(solution("abc1abc1abc")) // acbac
}

/* forEachIndexed 를 사용해서 index, value 를 받아오는 방법
fun solution(code: String): String {
    var mode = 0
    var answer = ""
    code.forEachIndexed { i, v ->
        if (v == '1') mode = mode xor 1
        else if (mode == 0 && i % 2 == 0) answer += v
        else if (mode == 1 && i % 2 != 0) answer += v
    }
    return if (answer.isNotEmpty()) answer else "EMPTY"
}
 */

