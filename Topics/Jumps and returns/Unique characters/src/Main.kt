fun main() {
    val word = readLine()!!.toCharArray().sorted()
    var count = 0
    var multiple = false
    for (i in 0 until word.size - 1) {
        if (word[i] == word[i + 1]) {
            multiple = true
            continue
        } else if (word[i] != word[i + 1] && multiple) {
            multiple = false
            continue
        } else {
            count++
        }
    }
    if (word[word.size - 2] != word[word.size - 1]) count++
    print(count)
}