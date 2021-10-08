fun main() {
    val input = readLine()!!.toString()
    var alphabet = "abcdefghijklmnopqrstuvwxyz"
    for (ch in input) {
        alphabet.replace(ch.toString(), "").also { alphabet = it }
    }
    print(alphabet)
}