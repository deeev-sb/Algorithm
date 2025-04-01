package foundation_kotlinPractice.day18

fun solution4(myString: String, pat: String): Int =
    if (myString.map { c -> if (c == 'A') 'B' else 'A' }.joinToString("").contains(pat)) 1 else 0

//    myString.map { c -> if (c == 'A') 'B' else 'A' }.joinToString("")
//        .let { if (it.windowed(pat.length).count { it == pat } > 0) 1 else 0 }

fun main() {
    println(solution4("ABBAA", "AABB")) // 1
    println(solution4("ABAB", "ABAB")) // 0
}