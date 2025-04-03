package foundation_kotlinPractice.day18

fun solution5(rny_string: String): String = rny_string.replace("m", "rn")

fun main() {
    println(solution5("masterpiece")) // "rnasterpiece"
    println(solution5("programmers")) // "prograrnrners"
    println(solution5("jerry")) // "jerry"
    println(solution5("burn")) // "burn"
}