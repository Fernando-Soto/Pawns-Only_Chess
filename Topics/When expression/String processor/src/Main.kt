fun main() {
    val first = readLine()!!.toString()
    val operator = readLine()!!.toString()
    val second = readLine()!!.toString()
    when (operator) {
        "equals" -> print(first == second)
        "plus" -> print(first + second)
        "endsWith" -> print(first.endsWith(second))
        else -> print("Unknown operation")
    }
}