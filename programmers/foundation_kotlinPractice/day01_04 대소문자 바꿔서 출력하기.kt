package foundation_kotlinPractice

//영어 알파벳으로 이루어진 문자열 str이 주어집니다. 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.

fun main(args: Array<String>) {
    val s1 = readLine()!!

    for (i in s1.indices) {
        if (s1[i].isUpperCase()) {
            print(s1[i].lowercaseChar())
        } else if (s1[i].isLowerCase()) {
            print(s1[i].uppercaseChar())
        }
    }
}