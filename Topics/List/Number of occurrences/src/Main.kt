fun solution(strings: List<String>, str: String): Int {
    var count = 0
    for (element in strings) {
        if (str == element) count++
    }
    return count
}