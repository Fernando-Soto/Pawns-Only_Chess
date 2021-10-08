fun main() {
    val length = readLine()!!.toInt()
    val list = MutableList<Int>(length) { 0 }
    for (i in list.indices) {
        list[i] = readLine()!!.toInt()
    }
    val numToFind = readLine()!!.toInt()
    var result = 0
    for (num in list) {
        if (num == numToFind) result++
    }
    print(result)
}