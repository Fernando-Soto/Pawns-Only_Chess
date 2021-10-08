import java.util.*

fun main() {
    var max = 0
    val scanner = Scanner(System.`in`)
    while (scanner.hasNext()) {
        val next = scanner.next().toInt()
        if (next == 0) break
        if (next > max) max = next
    }
    println(max)
}