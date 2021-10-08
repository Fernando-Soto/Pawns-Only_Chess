fun main() = when (readLine()!!.toInt()) {
    1, 3, 4 -> print("No!")
    2 -> print("Yes!")
    else -> print("Unknown number")
}