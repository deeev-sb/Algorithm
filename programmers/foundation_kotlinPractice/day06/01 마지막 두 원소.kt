package foundation_kotlinPractice.day06

/*
마지막 원소가 그 전 원소보다 크면 마지막 원소에서 그 전 원소를 뺀 값을,
마지막 원소가 그 전 원소보다 크지 않다면 마지막 원소를 두 배 한 값을 추가하여 반환
 */

/*
fun solution(numList: IntArray): IntArray {
    val lastIndex = numList.size - 1;
    val last = numList.last()
    val secondLast = numList[lastIndex - 1]
    return numList.plus(if (last > secondLast) last - secondLast else last * 2)
}
*/

fun solution(numList: IntArray): IntArray {
    val (secondLast, last) = numList.takeLast(2)
    return numList.plus(if (last > secondLast) last - secondLast else last * 2)
}

fun main() {
    println(solution(intArrayOf(2, 1, 6)).toList()) // [2, 1, 6, 5]
    println(solution(intArrayOf(5, 2, 1, 7, 5)).toList()) // [5, 2, 1, 7, 5, 10]
}