import kotlin.math.abs

data class CellLocations(val fromRow: Int, val fromCol: Int, val toRow: Int, val toCol: Int)
data class Message(val returnValue: Boolean, val message: String)

private var firstPlayer = ""
private const val firstColor = "W"
private var secondPlayer = ""
private const val secondColor = "B"
private var activePlayer = firstPlayer

private val cb = mutableListOf(
    mutableListOf(" ", " ", " ", " ", " ", " ", " ", " "),
    mutableListOf("W", "W", "W", "W", "W", "W", "W", "W"),
    mutableListOf(" ", " ", " ", " ", " ", " ", " ", " "),
    mutableListOf(" ", " ", " ", " ", " ", " ", " ", " "),
    mutableListOf(" ", " ", " ", " ", " ", " ", " ", " "),
    mutableListOf(" ", " ", " ", " ", " ", " ", " ", " "),
    mutableListOf("B", "B", "B", "B", "B", "B", "B", "B"),
    mutableListOf(" ", " ", " ", " ", " ", " ", " ", " "),
)

private fun printChessboard() {
    val border = "  +---+---+---+---+---+---+---+---+"
    for (n in 7.downTo(0)) {
        print("$border\n")
        print("${n + 1} | ${cb[n][0]} | ${cb[n][1]} | ${cb[n][2]} | ${cb[n][3]} | ${cb[n][4]} | ${cb[n][5]} | ${cb[n][6]} | ${cb[n][7]} |\n")
    }
    print("$border\n")
    print("    a   b   c   d   e   f   g   h\n\n")
}

private fun getUsersNames() {
    println("First Player's name:")
    firstPlayer = readLine()!!
    println("Second Player's name:")
    secondPlayer = readLine()!!
    activePlayer = firstPlayer
}

private fun validateCommand(theMove: String): Boolean {
    val validateInputRegex = Regex("([a-h][1-8]){2}")
    return validateInputRegex.matches(theMove)
}

private fun getPlayersMove(player: String): String {
    var move: String
    while (true) {
        println("$player's turn:")
        move = readLine()!!
        return if (move == "exit") {
            "exit"
        } else {
            if (validateCommand(move)) {
                move
            } else {
                println("Invalid Input")
                continue
            }
        }
    }
}

private fun switchPlayer() {
    activePlayer = if (activePlayer == firstPlayer) {
        secondPlayer
    }
    else {
        firstPlayer
    }
}

private fun correctMoveIndex(move: String): CellLocations {
    return CellLocations(
        (move[1].code - 48) - 1,
        (move[0].code - 97),
        (move[3].code - 48) - 1,
        (move[2].code - 97)
    )
}

private fun isStartColorCorrect(cells: CellLocations, move: String): Message {
    when (activePlayer) {
        firstPlayer -> {
            return when (cb[cells.fromRow][cells.fromCol]) {
                "W" -> {
                    Message(true, "")
                }
                else -> {
                    Message(false, "No white pawn at ${move.subSequence(0, 2)}")
                }
            }
        }
        else -> {
            return when (secondColor) {
                cb[cells.fromRow][cells.fromCol] -> {
                    Message(true, "")
                }
                else -> {
                    Message(false, "No black pawn at ${move.subSequence(0, 2)}")
                }
            }
        }
    }
}

private fun isForwardValid(locations: CellLocations): Boolean {
    return (locations.fromCol == locations.toCol) &&
            (abs(locations.fromRow - locations.toRow) in (1..2)) &&
            (cb[locations.toRow][locations.toCol] == " ")
}

private fun moveForward(move: String): Message {
    // Convert the user input to correct cells because board start index
    // is 1 and not zero as the array does.
    val correctLocation = correctMoveIndex(move)
    // Message object is correct color if returnValue is true and invalid if false.
    // if false send message to the console
    val startColor = isStartColorCorrect(correctLocation, move)
    if (!startColor.returnValue) {
        println(startColor.message)
        return startColor
    }
    if (activePlayer == firstPlayer && isForwardValid(correctLocation)) {
        return if (correctLocation.fromRow == 1 &&
            correctLocation.toRow - correctLocation.fromRow == 2) {
            cb[correctLocation.toRow][correctLocation.toCol] = "W"
            cb[correctLocation.fromRow][correctLocation.fromCol] = " "
            startColor
        } else if (correctLocation.toRow - correctLocation.fromRow == 1) {
            cb[correctLocation.toRow][correctLocation.toCol] = "W"
            cb[correctLocation.fromRow][correctLocation.fromCol] = " "
            startColor
        } else {
            println("Invalid Input")
            Message(false, "Invalid Input")
        }
    }
    else {
        return if (correctLocation.fromRow == 6  && isForwardValid(correctLocation)
            && correctLocation.fromRow - correctLocation.toRow == 2) {
            cb[correctLocation.toRow][correctLocation.toCol] = "B"
            cb[correctLocation.fromRow][correctLocation.fromCol] = " "
            startColor
        } else if (correctLocation.fromRow - correctLocation.toRow == 1 && isForwardValid(correctLocation)) {
            cb[correctLocation.toRow][correctLocation.toCol] = "B"
            cb[correctLocation.fromRow][correctLocation.fromCol] = " "
            startColor
        } else {
            println("Invalid Input")
            Message(false, "Invalid Input")
        }
    }
}

fun main() {
    println(" Pawns-Only Chess")
    getUsersNames()
    printChessboard()
    while (true) {
        val result = getPlayersMove(activePlayer)
        // If result != to exit then at this point the coordinates of the move is valid
        if (result == "exit")  break
        if (!moveForward(result).returnValue) continue
        printChessboard()
        switchPlayer()
    }
    println("Bye!")
}