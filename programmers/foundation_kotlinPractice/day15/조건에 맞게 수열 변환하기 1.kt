package foundation_kotlinPractice.day15

//  50보다 크거나 같은 짝수라면 2로 나누고, 50보다 작은 홀수라면 2를 곱합니다.
fun solution(arr: IntArray): IntArray =
    arr.apply { arr.forEachIndexed { i, _ -> if (arr[i] >= 50 && arr[i] % 2 == 0) arr[i] /= 2 else if (arr[i] < 50 && arr[i] % 2 != 0) arr[i] *= 2 } }


fun main() {
    println(solution(intArrayOf(1, 2, 3, 100, 99, 98)).contentToString()) // [2, 2, 6, 50, 99, 49]
}