fun main() {
    val numElements = readLine()!!.toInt()
    val array = IntArray(numElements)

    for (x in 0 until numElements) {
        array[x] = readLine()!!.toInt()
    }
    val find = readLine()!!.toInt()
    val found = array.find { it == find }
    if (found != null) print("YES") else print("NO")
}
