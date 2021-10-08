fun main() {
    val length = readLine()!!.toInt()
    val a = MutableList<Int>(length) { 0 }
    for (idx in 1..length) {
        if (idx == length) {
            readLine()!!.toInt().also { a[0] = it }    
        } else readLine()!!.toInt().also { a[idx] = it }
    }
    print(a.joinToString(" "))
}