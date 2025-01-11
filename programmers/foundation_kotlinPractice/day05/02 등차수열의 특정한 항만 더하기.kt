package foundation_kotlinPractice.day05

/*
첫째항이 a, 공차가 d 인 등차수열에서 included[i] 가 i + 1 항을 의미할 때,
1항부터 n 항까지 included r가 true 인 항들만 더한 값을 return 하는 solution

 */

fun solution(a: Int, d: Int, included: BooleanArray): Int {
    var num = 0;
    for (i in included.indices) {
        if (included[i]) {
            num += a + d * i
        }
    }
    return num;
}

fun main() {
    println(solution(3, 4, booleanArrayOf(true, false, false, true, true))) // 37
    println(solution(7, 1, booleanArrayOf(false, false, false, true, false, false, false))) // 10
}

/*
fun solution(a: Int, d: Int, included: BooleanArray) = included.indices.filter { included[it] }.sumOf { a + d * it }
 */

/*
fun solution(a: Int, d: Int, included: BooleanArray): Int =
    included.mapIndexed { idx, b -> if (b) a + d * idx else 0 }.sum()
 */

/*
fun solution(a: Int, d: Int, included: BooleanArray): Int {
    return included.mapIndexed { i, v -> if (v) a + d*i else 0 }.sum()
}
 */