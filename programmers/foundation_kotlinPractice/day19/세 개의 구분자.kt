package foundation_kotlinPractice.day19

fun solution(myStr: String): Array<String> =
    myStr.split("a", "b", "c").filterNot(String::isBlank).toTypedArray()
        .run { if (isEmpty()) arrayOf("EMPTY") else this }

fun main() {
    println(solution("baconlettucetomato").contentToString()) // ["onlettu", "etom", "to"]
    println(solution("abcd").contentToString()) // ["d"]
    println(solution("cabab").contentToString()) // ["EMPTY"]
}