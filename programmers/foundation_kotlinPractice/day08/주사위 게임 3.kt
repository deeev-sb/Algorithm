package foundation_kotlinPractice.day08

import kotlin.math.abs

/*
- 네 주사위에서 나온 수가 모두 같다면 1111 * p
- 세 주사위에서 나온 숫자가 p로 같고
  다른 주사위에서 나온 숫자가 q라면
  (10 * p + q)^2
- 주사위 두 개씩 같은 값이 나오고,
  나온 숫자를 각각 p,q라고 한다면 (p + q) * |p - q|
- 어느 두 주사위에서 나온 숫자가 p로 같고,
  나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r이라면
  q * r
- 네 주사위에 적힌 숫자가 모두 다르면 나온 숫자 중
  가장 작은 숫자
 */

fun solution(a: Int, b: Int, c: Int, d: Int): Int {
    val dice = mutableMapOf<Int, Int>()

    dice[a] = dice.getOrDefault(a, 0) + 1
    dice[b] = dice.getOrDefault(b, 0) + 1
    dice[c] = dice.getOrDefault(c, 0) + 1
    dice[d] = dice.getOrDefault(d, 0) + 1

    when(dice.size) {
        1 -> return 1111 * a
        2 -> {
            val sortedList = dice.entries.toList().sortedByDescending { it.value }
            val p = sortedList[0].key
            val q = sortedList[1].key
            return if (sortedList[0].value == sortedList[1].value) (p + q) * abs(p - q) else (10 * p + q) * (10 * p + q)
        }
        3 -> {
            val sortedList = dice.entries.toList().sortedBy { it.value }
            return sortedList[0].key * sortedList[1].key
        }
        else -> return dice.toSortedMap().keys.first()
    }
}

fun main() {
    println(solution(2, 2, 2, 2)) // 2222
    println(solution(4, 1, 4, 4)) // 1681
    println(solution(6, 3, 3, 6)) // 27
    println(solution(2, 5, 2, 6)) // 30
    println(solution(6, 4, 2, 5)) // 2
}