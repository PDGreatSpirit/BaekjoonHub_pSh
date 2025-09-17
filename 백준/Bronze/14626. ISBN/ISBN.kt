import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val s = br.readLine().trim()
    require(s.length == 13)

    val last = s[12] - '0'
    var starIdx = -1
    var sumKnown = 0

    for (i in 0 until 12) {
        val w = if (i % 2 == 0) 1 else 3
        val ch = s[i]
        if (ch == '*') {
            starIdx = i
        } else {
            val d = ch - '0'
            sumKnown += w * d
        }
    }

    val m = last
    var rhs = (10 - ((sumKnown + m) % 10)) % 10

    val wStar = if (starIdx % 2 == 0) 1 else 3

    val x = when (wStar) {
        1 -> rhs
        3 -> (rhs * 7) % 10
        else -> error("unexpected weight")
    }

    println(x)

}