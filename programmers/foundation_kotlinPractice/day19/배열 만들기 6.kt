package foundation_kotlinPractice.day19

import java.util.Stack

// 배열 만들기 6
fun solution4(arr: IntArray): IntArray {
    val stk = Stack<Int>()

    var i = 0
    while(i < arr.size) {
        if (stk.isEmpty()) stk.add(arr[i])
        else if (stk.last() == arr[i]) stk.pop()
        else stk.add(arr[i])
        i++
    }

    return if (stk.isEmpty()) intArrayOf(-1) else stk.toIntArray()
}

fun main() {
    println(solution4(intArrayOf(0, 1, 1, 1, 0)).contentToString()) // [0, 1, 0]
    println(solution4(intArrayOf(0, 1, 0, 1, 0)).contentToString()) // [0, 1, 0, 1, 0]
    println(solution4(intArrayOf(0, 1, 1, 0)).contentToString()) // [-1]
}