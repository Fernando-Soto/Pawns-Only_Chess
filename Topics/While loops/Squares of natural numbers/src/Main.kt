fun main() {
    val inputNum = readLine()!!.toInt()
    var i = 1
    while (i * i <= inputNum) {
        println(i * i)
        i++
    }
}