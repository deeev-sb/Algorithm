package foundation_kotlinPractice

fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)
    println("a = $a")
    println("b = $b")
}