import java.util.*

fun main() {
    var count = 0
    val scanner = Scanner(System.`in`)
    while (scanner.hasNext()) {
        val next = scanner.next().toInt()
        if (next >= 1) count += next else break
    }
    println(count)
}