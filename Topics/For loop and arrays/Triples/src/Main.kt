fun main() {
    val size = readLine()!!.toInt()
    val array = IntArray(size)
    for (i in array.indices) {
        array[i] = readLine()!!.toInt()
    }
    if (size < 3) return print("0")
    var numberOfTriples = 0
    val lastIndexToTest = size - 3
    for (i in 0..lastIndexToTest) {
        if (array[i] + array[i + 1] + array[i + 2] == array[i] + array[i] + 1 + array[i] + 2) numberOfTriples++
    }
    print(numberOfTriples)
}