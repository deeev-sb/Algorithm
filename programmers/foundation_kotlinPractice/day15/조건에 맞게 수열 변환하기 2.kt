package foundation_kotlinPractice.day15

// 50보다 크거나 같은 짝수라면 2로 나누고, 50보다 작은 홀수라면 2를 곱하기 1
// arr[x] = arr[x+1]인 x 중 가장 작은 값 반환
fun solution_(arr: IntArray): Int {
    var count = 0
    var isChange = true;
    while (isChange) {
        isChange = false
        arr.forEachIndexed { j, _ ->
            if (arr[j] >= 50 && arr[j] % 2 == 0) {
                arr[j] /= 2
                isChange = true
            } else if (arr[j] < 50 && arr[j] % 2 != 0) {
                arr[j] = arr[j] * 2 + 1
                isChange = true
            }
        }
        count++
    }
    return count - 1
}


fun main() {
    println(solution_(intArrayOf(1, 2, 3, 100, 99, 98))) // 5
}