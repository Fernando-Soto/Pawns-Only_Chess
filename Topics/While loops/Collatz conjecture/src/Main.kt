fun main() {
    val startNum = readLine()!!.toInt()
    print("$startNum ")
    if (startNum == 1) return
    var currentValue = startNum
    while (true) {
        if (currentValue % 2 == 0) {
            currentValue /= 2
        } else {
            currentValue = currentValue * 3 + 1
        }
        print("$currentValue  ")
        if (currentValue == 1) break
    }
}