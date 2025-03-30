package foundation_kotlinPractice.day18

fun solution3(binomial: String): Int =
    binomial.split(" ").let {
        if (it[1] == "+") it[0].toInt() + it[2].toInt()
        else if (it[1] == "-") it[0].toInt() - it[2].toInt()
        else it[0].toInt() * it[2].toInt()
    }

fun main() {
    println(solution3("43 + 12")) // 55
    println(solution3("0 - 7777")) // -7777
    println(solution3("40000 * 40000")) // 1600000000
}