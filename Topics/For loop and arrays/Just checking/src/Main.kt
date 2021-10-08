fun main() {
    val size = readLine()!!.toInt()
    val array = IntArray(size)

    for (i in 0..array.lastIndex) {
        array[i] = readLine()!!.toInt()
    }

    val (p, m) = readLine()!!.split(' ').map(String::toInt)
    var containsP = false
    var containsM = false

    for (i in array.indices) {
        if (array[i] == p) containsP = true
        if (array[i] == m) containsM = true
    }

    if (containsP && containsM) print("YES") else print("NO")
}