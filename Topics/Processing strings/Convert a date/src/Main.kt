fun main() {
    val strDate = readLine()!!
    val (y, m, d) = strDate.split("-")
    print("$m/$d/$y")
}