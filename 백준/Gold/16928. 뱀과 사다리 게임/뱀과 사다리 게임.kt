import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

class Fs {
    private val br = BufferedReader(InputStreamReader(System.`in`))
    private var st: StringTokenizer? = null
    fun nextInt(): Int {
        while (st == null || !st!!.hasMoreTokens()) st = StringTokenizer(br.readLine())
        return st!!.nextToken().toInt()
    }
}

data class Loc(val x: Int, val day: Int)

fun main() {
    val fs = Fs()
    val S = fs.nextInt()
    val D = fs.nextInt()

    // 사다리/뱀 매핑: 기본은 자기 자신
    val arr = IntArray(101) { it }
    val days = IntArray(101) { -1 }

    repeat(S + D) {
        val from = fs.nextInt()
        val to = fs.nextInt()
        arr[from] = to
    }

    val q = ArrayDeque<Loc>()
    q.addLast(Loc(1, 0))
    days[1] = 0

    while (q.isNotEmpty()) {
        val cur = q.removeFirst()

        // 현재 칸에서 주사위 1..6
        for (dice in 1..6) {
            val nx = cur.x + dice
            if (nx > 100) continue

            val to = arr[nx]
            if (days[to] != -1) continue  

            val nd = cur.day + 1
            days[to] = nd

            q.addLast(Loc(to, nd))
        }
    }

    // 이 문제에선 항상 도달 가능하지만, 혹시 몰라서
    println(days[100])
}