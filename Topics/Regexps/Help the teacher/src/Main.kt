fun main() {
    val report = readLine()!!
    val regex = Regex(".?. wrong answers?")
    val result = regex.matches(report)
    val wrongAnswers = report.split(" ")[0].toInt()
    if (result && wrongAnswers <= 9) print("true") else print("false")


    val a = Regex("1[2-4][a-c]b")
    a.matches("1[234][abc]b")
}