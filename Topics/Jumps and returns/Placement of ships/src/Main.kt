private val shipLocator = mutableListOf(
    mutableListOf(" ", " ", " ", " ", " "),
    mutableListOf(" ", " ", " ", " ", " "),
    mutableListOf(" ", " ", " ", " ", " "),
    mutableListOf(" ", " ", " ", " ", " "),
    mutableListOf(" ", " ", " ", " ", " "),
)

var rows = ""
var cols = ""

fun main() {
    for (i in 0..2) {
        val (x, y) = readLine()!!.split(' ')
        shipLocator[x.toInt() - 1][y.toInt() - 1] = "S"
    }
    nextRow@ for (i in 0..4) {
        for (j in 0..4) {
            if (shipLocator[i][j] == "S") {
                continue@nextRow
            }
            else {
                if (j == 4) rows +=  "${i + 1} "
            }
        }
    }
    println("${rows.trim()}")
    nextCol@ for (j in 0..4) {
        for (i in 0..4) {
            if (shipLocator[i][j] == "S") {
                continue@nextCol
            }
            else {
                if (i == 4) cols += "${j + 1} "
            }
        }
    }
    println("${cols.trim()}")
}