fun main() {
    when (readLine()!!.toInt()) {
        0 -> print("do not move")
        1 -> print("move up")
        2 -> print("move down")
        3 -> print("move left")
        4 -> print("move right")
        else -> print("error!")
    }
}