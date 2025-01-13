package foundation_kotlinPractice.day05

/*
세 숫자가 모두 다른 경우 : a + b + c
두 숫자가 같은 경우 :  (a + b + c) * (a^2 + b^2 + c^2)
세 숫자 모두 같은 경우 : (a + b + c) * (a^2 + b^2 + c^2) * (a^3 + b^3 + c^3)
 */

fun solution(a: Int, b: Int, c: Int): Int {
    val sum = a + b + c
    val sumOfSquares = a.sq() + b.sq() + c.sq()
    val sumOfCubes = a.cube() + b.cube() + c.cube()
    return when {
        a != b && b != c && c != a -> sum
        a == b && b == c -> sum * sumOfSquares * sumOfCubes
        else -> sum * sumOfSquares
    }
}

private fun Int.sq() = this * this
private fun Int.cube() = this * this * this

fun main() {
    println(solution(2, 6, 1)) // 9
    println(solution(5, 3, 3)) // 473
    println(solution(4, 4, 4)) // 110592
}

/* set 을 이용해서 size 측정하는 방법..! (왜 나는 비교만 생각했을까..)
fun solution(a: Int, b: Int, c: Int): Int {
    val set = intArrayOf(a, b, c).toSet()
    return when (set.size) {
        3 -> a + b + c
        2 -> (a + b + c) * (a * a + b * b + c * c)
        1 -> (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c)
        else -> -1
    }
}
 */