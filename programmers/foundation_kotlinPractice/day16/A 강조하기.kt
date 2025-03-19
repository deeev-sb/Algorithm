package foundation_kotlinPractice.day16

fun solution3(myString: String): String = myString.map { if (it == 'a') 'A' else if(it != 'A') it.lowercase() else it }.joinToString("")

fun main() {
    println(solution3("abstract algebra")) // AbstrAct AlgebrA
    println(solution3("PrOgRaMmErS")) // progrAmmers
}