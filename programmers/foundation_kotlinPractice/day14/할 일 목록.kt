package foundation_kotlinPractice.day14

fun solution(todo_list: Array<String>, finished: BooleanArray): Array<String>
    = todo_list.filterIndexed{ index, _ -> !finished[index]}.toTypedArray()

fun main() {
    println(solution(arrayOf("problemsolving", "practiceguitar", "swim", "studygraph") ,booleanArrayOf(true, false, true, false))
        .contentToString()) // ["practiceguitar", "studygraph"]
}