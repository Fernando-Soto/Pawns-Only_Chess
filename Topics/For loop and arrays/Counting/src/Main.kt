fun main() {
    val size = readLine()!!.toInt()
    val array = IntArray(size)
    
    for (i in 0 until size) {
        array[i] = readLine()!!.toInt()
    }
    val find = readLine()!!.toInt()
    var count = 0
    for (i in 0 until size) {
        if (array[i] == find) count++
    }
    print("$count")
}
