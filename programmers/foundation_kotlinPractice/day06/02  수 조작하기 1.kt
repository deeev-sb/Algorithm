package foundation_kotlinPractice.day06

/*
control 은 w, a, s, d 의 4개 문자로 이루어짐
- w : n += 1
- s : n -= 1
- d : n += 10
- a : n -= 10
 */

/*
fun solution(n: Int, control: String): Int {
    var num = n
    for (c in control) {
        when (c) {
            'w' -> num += 1
            's' -> num -= 1
            'd' -> num += 10
            'a' -> num -= 10
        }
    }

    return num
}
 */

fun solution(n: Int, control: String): Int {
    return control.fold(n) { acc, c ->
        acc + when (c) {
            'w' -> 1
            's' -> -1
            'd' -> 10
            'a' -> -10
            else -> 0
        }
    }
}

fun main() {
    println(solution(0, "wsdawsdassw")) // -1
}