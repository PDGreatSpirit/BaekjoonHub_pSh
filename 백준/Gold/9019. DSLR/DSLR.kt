import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import java.lang.StringBuilder
import kotlin.math.*

private class FastScanner {
    private val br = BufferedReader(InputStreamReader(System.`in`))
    private var st: StringTokenizer? = null
    fun next(): String {
        while (st == null || !st!!.hasMoreTokens()) st = StringTokenizer(br.readLine())
        return st!!.nextToken()
    }
    fun nextInt(): Int = next().toInt()
}

fun main() {
    val fs = FastScanner()
    val t = fs.nextInt()
    val out = StringBuilder()

    repeat(t) {
        val A = fs.nextInt()
        val B = fs.nextInt()

        val visited = BooleanArray(10000)
        val prev = IntArray(10000) { -1 }
        val op = CharArray(10000)

        val q = ArrayDeque<Int>()
        visited[A] = true
        q.addLast(A)

        fun D(n: Int) = (n * 2) % 10000
        fun S(n: Int) = if (n == 0) 9999 else n - 1
        fun L(n: Int) = (n % 1000) * 10 + n / 1000
        fun R(n: Int) = n / 10 + (n % 10) * 1000


        loop@ while (q.isNotEmpty()) {
            val cur = q.removeFirst()
            if (cur == B) break

            val nexts = intArrayOf(D(cur), S(cur), L(cur), R(cur))
            val ops = charArrayOf('D', 'S', 'L', 'R')

            for (i in 0 until 4) {
                val nx = nexts[i]
                if (!visited[nx]) {
                    visited[nx] = true
                    prev[nx] = cur
                    op[nx] = ops[i]
                    if (nx == B) { 
                        break@loop
                    }
                    q.addLast(nx)
                }
            }
        }

        val sb = StringBuilder()
        var cur = B
        while (cur != A) {
            sb.append(op[cur])
            cur = prev[cur]
        }
        out.append(sb.reverse()).append('\n')
    }

    print(out.toString())
}