fun main() {
    val size = readLine()!!.toInt()
    val array = IntArray(size)
    for (i in array.indices) {
        array[i] = readLine()!!.toInt()
    }
    val max = array.maxOrNull()
    val idx = array.indexOfFirst { it == max }
    print(idx)

}
