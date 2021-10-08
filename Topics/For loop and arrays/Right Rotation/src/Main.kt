import java.util.*

fun main() {
    val size = readLine()!!.toInt()
    val array = mutableListOf<Int>()
    for (i in 0 until size) {
        array.add(readLine()!!.toInt())
    }
    Collections.rotate(array, readLine()!!.toInt())
    println("${array.joinToString(" ")}")
}
