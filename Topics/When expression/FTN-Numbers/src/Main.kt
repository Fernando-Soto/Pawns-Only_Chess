fun main() {
    val inputNum = readLine()!!.toInt()
    when (inputNum) {
        in 0..3, 5, 8, 13, 21, 34, 55 -> print("F")
        in 0..3, 6, 10, 15, 21, 28, 36, 45 -> print("T")
        1, 10, 100, 1_000, 10_000, 100_000 -> print("P")
        else -> print("N")
    }
}