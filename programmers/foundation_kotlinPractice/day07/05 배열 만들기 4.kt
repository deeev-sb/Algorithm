package foundation_kotlinPractice.day07

import java.util.*

/*
기존 배열 arr을 이용해 신규 배열 stk 생성
변수 i를 만들어 초기값을 0으로 설정한 후 i가 arr의 길이보다 작으면 다음 작업을 반복합니다.
- stk가 빈 배열이라면 arr[i]를 stk에 추가
- stk에 원소가 있을 때
    - 마지막 원소 < arr[i] : arr[i]를 stk 뒤에 추가
    - 마지막 원소 >= arr[i] : arr[i]를 stk 마지막 원소를 stk에서 제거
 */

fun solution(arr: IntArray): IntArray {
    val stk: Stack<Int> = Stack<Int>()

    var index = 0;
    while (index < arr.size) {
        val num = arr[index]
        if (stk.isEmpty()) {
            stk.push(num)
            index++
        }
        else if (stk.peek() < num) {
            stk.push(num)
            index++
        }
        else stk.pop()
    }

    return stk.toIntArray()
}

fun main() {
    println(
        solution(intArrayOf(1, 4, 2, 5, 3)).contentToString()
    ) // toString
}