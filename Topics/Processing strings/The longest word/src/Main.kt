fun main() {
    val input = readLine()!!
    val wordList = input.split(" ")
    var longestWord = ""
    var wordLength = 0
    for (word in wordList) {
        val len = word.length
        if (len > wordLength) {
            wordLength = len
            longestWord = word
        }
    }
    print("$longestWord")
}