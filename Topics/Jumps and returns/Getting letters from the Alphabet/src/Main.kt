fun main() {
    val letter = readLine()!![0]

    for (ch in 'a'..'z') {
        if (ch < letter) {
            print(ch)
            continue
        }
        return
    }
}