package foundation_kotlinPractice.day02

fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)
    println("$a + $b = ${a + b}")
}