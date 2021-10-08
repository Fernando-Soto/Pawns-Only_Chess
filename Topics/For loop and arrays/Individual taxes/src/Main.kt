fun main() {
    val size = readLine()!!.toInt()
    val annualIncome = IntArray(size)
    val taxes = IntArray(size)
    for (i in annualIncome.indices) {
        annualIncome[i] = readLine()!!.toInt()
    }
    for (i in taxes.indices) {
        taxes[i] = readLine()!!.toInt()
    }
    var paysMostTaxes = 0
    var idx = 0
    for (i in annualIncome.indices) {
        val tax = annualIncome[i] * (taxes[i] / 100f)
        if (tax > paysMostTaxes) {
            paysMostTaxes = tax.toInt()
            idx = i + 1
        }
    }
    print("$idx")
}
