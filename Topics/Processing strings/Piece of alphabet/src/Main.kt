fun main() {
    val input = readLine()!!
    var chValue = 0
    var result = true
    for (ch in input) {
        val value = ch.toInt()
        if (chValue == 0) {
            chValue = value
            continue
        }
        if (chValue + 1 == value) {
            chValue = value
            result = true
        } else {
            result = false
            break
        }
    }
    if (result) print("true") else print("false")
}