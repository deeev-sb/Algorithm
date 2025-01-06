package foundation_kotlinPractice.day03

/* 가장 단순하게 푼 방법
class Solution {
    fun solution(str1: String, str2: String): String {
        var answer : String = ""
        val length = str1.length
        for (i in 0 until length) {
            answer += str1[i]
            answer += str2[i]
        }

        return answer
    }
}
*/

// buildString 을 이용한 방법
// - 내부적으로 StringBuilder를 사용하여 문자열을 효율적으로 구축
// - 문자열의 임시 객체 생성을 최소화하고, 최종 문자열 크기를 예측하여 필요한 메모리 한 번에 할당
// => 뛰어난 성능 + 메모리 절약

fun solution(str1: String, str2: String): String {
    return buildString {
        for (i in str1.indices) {
            append(str1[i])
            append(str2[i])
        }
    }
}

 fun main() {
     println(solution("aaaaa", "bbbbb"))
 }


/* joinToString 를 사용한 방법
- 간결하고 직관적인 방법
- 내부적으로 문자열을 결합하는 과정에서 일정한 오버헤드가 발생할 수 있음. 특히, 숫자나 포맷팅 표현식을 사용할 경우 더 많은 성능 손실이 발생할 수 있음

fun solution(str1: String, str2: String): String {
    return (str1.indices).joinToString("") {
        "${str1[it]}${str2[it]}"
    }
}

*/