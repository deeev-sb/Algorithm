package foundation_kotlinPractice.day01

//문자열 str과 정수 n이 주어집니다.
//str이 n번 반복된 문자열을 만들어 출력하는 코드를 작성해 보세요.

fun main(args: Array<String>) {
    val input = readLine()!!.split(' ')
    val s1 = input[0]
    val a = input[1]!!.toInt()

    for (i in 1..a) {
        print(s1)
    }
}