fun main() {
    val size = readLine()!!.toInt()
    val array = IntArray(size)
    for (i in array.indices) {
        array[i] = readLine()!!.toInt()
    }
    val (p, m) = readLine()!!.split(" ").map { it.toInt() }
    var result = "YES"
    for (i in 0 until array.lastIndex) {
        if (p == array[i] && m == array[i + 1] || m == array[i] && p == array[i + 1]) {
            result = "NO"
            break
        }
    }
    print("$result")
}