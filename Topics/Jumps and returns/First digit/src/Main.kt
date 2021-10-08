fun main() {
    val input = readLine()!!.toString()
    for (ch in input) {
        if (ch.isDigit()) {
            print(ch)
            break
        }
    }
}