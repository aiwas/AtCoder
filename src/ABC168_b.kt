package net.elendia.atcoder

fun main() {
    val k = readLine()!!.toInt()
    val s = readLine()?:""
    if(s.length <= k) {
        print(s)
    } else {
        print(s.substring(0, k) + "...")
    }
}
