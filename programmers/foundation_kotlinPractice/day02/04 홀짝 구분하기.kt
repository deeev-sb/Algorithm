package foundation_kotlinPractice.day02

fun main(args: Array<String>) {
    val a = readLine()!!.toInt()

    if (a % 2 == 0) print("$a is even") else print("$a is odd")
}