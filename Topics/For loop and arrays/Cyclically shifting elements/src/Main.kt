fun main() {
    val size = readLine()!!.toInt()
    val array = IntArray(size)
    for (i in array.indices) {
        array[i] = readLine()!!.toInt()
    }
    if (array.size < 2) {
        print(array.joinToString(" "))
        return
    }
    val lastIdx = array.lastIndex
    var temp = 0
    for (i in array.lastIndex downTo 0) {
        if (i == 0) {
            array[1] = array[0]
            array[0] = temp
            break
        }
        if (i == lastIdx) {
            temp = array[lastIdx]
            continue
        }
        array[i + 1] = array[i]
    }
    print(array.joinToString(" "))

}