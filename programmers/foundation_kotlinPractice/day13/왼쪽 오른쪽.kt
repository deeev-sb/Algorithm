package foundation_kotlinPractice.day13

// "l" : 왼쪽에 있는 문자열들을 순서대로 담은 리스트 반환
// "r" : 오른쪽에 있는 문자열들을 순서대로 담은 리스트 반환
// X : 빈 문자열 반환
fun solution(str_list: Array<String>): Array<String> {
    for (i in str_list.indices) {
        if (str_list[i] == "l") {
            return str_list.sliceArray(0..<i)
        } else if (str_list[i] == "r") {
            return str_list.sliceArray(i + 1..<str_list.size)
        }
    }
    return arrayOf()
}

fun main() {
    println(solution(arrayOf("u", "u", "l", "r")).contentToString()) // ["u", "u"]
    println(solution(arrayOf("l")).contentToString()) // []
}

/*

 */