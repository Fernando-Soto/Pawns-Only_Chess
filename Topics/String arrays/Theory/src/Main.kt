// You can experiment here, it won’t be checked

fun main(args: Array<String>) {
    var backFromTheWall = readLine()!!.split(',').map { it }.toTypedArray()
    val returnedWatchman = readLine()!!.toString()
    // do not touch the lines above
    // write your code here
    backFromTheWall += returnedWatchman
    print(backFromTheWall.joinToString())
}
