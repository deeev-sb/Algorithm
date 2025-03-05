package foundation_kotlinPractice.day15

fun solution__(num_list: IntArray): Int {
    var answer = 0

    for (i in num_list) {
        var num = i
        while(num != 1) {
            num = if (num % 2 == 0) num / 2 else (num - 1) / 2
            answer++
        }
    }

    return answer
}

fun main() {
    println(solution__(intArrayOf(12, 4, 15, 1, 14))) // 11
}

/* tailrec 을 사용해서 재귀 형식으로 구성
fun solution(num_list: IntArray): Int = num_list.map{check(it, 0)}.sum()
tailrec fun check(a: Int, cnt: Int): Int = if(a == 1) cnt else check(a / 2, cnt+1)
 */