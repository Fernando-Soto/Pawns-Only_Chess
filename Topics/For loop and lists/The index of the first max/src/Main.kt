fun main() {
    val length = readLine()!!.toInt()
    val list = MutableList<Int>(length) { 0 }
    for (i in list.indices) {
        list[i] = readLine()!!.toInt()
    }
    var idx1 = -1
    var max = 0
    for (idx2 in list.indices) {
        if (list[idx2] > max) {
            max = list[idx2]
            idx1 = idx2
        }
    }
    print(idx1)
}