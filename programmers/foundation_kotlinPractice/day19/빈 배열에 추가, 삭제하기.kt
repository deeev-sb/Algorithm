package foundation_kotlinPractice.day19

fun solution3(arr: IntArray, flag: BooleanArray): IntArray {
    val result = mutableListOf<Int>()
    flag.mapIndexed { idx, b ->
        if (b) repeat(arr[idx] * 2) { result.add(arr[idx]) }
        else repeat(arr[idx]) { if (result.isNotEmpty()) result.removeAt(result.lastIndex) }
    }
    return result.toIntArray()
}

fun main() {
    println(
        solution3(
            intArrayOf(3, 2, 4, 1, 3),
            booleanArrayOf(true, false, true, false, false)
        ).contentToString()
    ) // [3, 3, 3, 3, 4, 4, 4, 4]
}