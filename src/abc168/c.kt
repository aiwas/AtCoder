package abc168

import kotlin.math.PI
import kotlin.math.sqrt

fun main() {
    val (a, b, h, m) = readLine()!!.split(" ").map { it.toInt() }
    //args[0]=A,[1]=B,[2]=H,[3]=M
    val rad = PI * 2 * ( ((h + (m / 60.0)) / 12.0) - (m / 60.0) )
    val rsq = (a * a + b * b) - (2 * a * b * Math.cos(rad))

    print(sqrt(rsq))
}