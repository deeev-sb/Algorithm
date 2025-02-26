package foundation_kotlinPractice.day14

fun solution(names: Array<String>): Array<String>
    = names.slice(0 .. names.lastIndex step 5).toTypedArray()

fun main() {
    println(solution(arrayOf("nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx")).contentToString())
    // ["nami", "vex"]
}