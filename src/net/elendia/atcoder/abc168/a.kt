package net.elendia.atcoder.abc168

fun main() {
    val n = readLine()!!.toInt()
    when (n % 10) {
        2, 4, 5, 7, 9 -> print("hon")
        0, 1, 6, 8 -> print("pon")
        else -> print("bon")
    }
}