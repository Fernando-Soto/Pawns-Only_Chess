fun main() {
    val length = readLine()!!.toInt()
    val list = MutableList<Int>(length) { 0 }
    for (i in list.indices) {
        list[i] = readLine()!!.toInt()
    }
    val (p, m) = readLine()!!.split(" ").map { it.toInt() }
    if (list.contains(p) && list.contains(m)) {
        print("YES")
    } else print("NO")
}