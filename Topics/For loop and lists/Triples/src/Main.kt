fun main() {
    val length = readLine()!!.toInt()
    val list = MutableList<Int>(length) { 0 }
    var numTriples = 0
    for (i in list.indices) {
        list[i] = readLine()!!.toInt()
    }
    val windows = list.windowed(3)
    for (window in windows) {
        if (window[0] == window[1] - 1 && window[1] == window[2] - 1) numTriples++
    }
    print(numTriples)
}