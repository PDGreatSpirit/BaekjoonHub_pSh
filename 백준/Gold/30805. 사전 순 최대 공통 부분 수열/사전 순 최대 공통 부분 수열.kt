import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

private class FastScanner {
    private val br = BufferedReader(InputStreamReader(System.`in`))
    private var st: StringTokenizer? = null
    fun nextInt(): Int {
        while (st == null || !st!!.hasMoreTokens()) {
            st = StringTokenizer(br.readLine())
        }
        return st!!.nextToken().toInt()
    }
}

fun main() {
    val fs = FastScanner()
    val N = fs.nextInt()
    val A = IntArray(N) { fs.nextInt() }
    val M = fs.nextInt()
    val B = IntArray(M) { fs.nextInt() }

    val V = 100  

    val nextA = Array(N + 1) { IntArray(V + 1) { -1 } }
    val nextB = Array(M + 1) { IntArray(V + 1) { -1 } }

    for (i in N - 1 downTo 0) {
        for (v in 1..V) nextA[i][v] = nextA[i + 1][v]
        nextA[i][A[i]] = i
    }
    for (j in M - 1 downTo 0) {
        for (v in 1..V) nextB[j][v] = nextB[j + 1][v]
        nextB[j][B[j]] = j
    }

    val result = mutableListOf<Int>()
    var i = 0
    var j = 0

    while (i < N && j < M) {
        var chosen = -1
        for (v in V downTo 1) {
            val ni = nextA[i][v]
            val nj = nextB[j][v]
            if (ni != -1 && nj != -1) {
                chosen = v
                i = ni + 1
                j = nj + 1
                result.add(v)
                break
            }
        }
        if (chosen == -1) break
    }

    if (result.isEmpty()) {
        println(0)
    } else {
        println(result.size)
        println(result.joinToString(" "))
    }
}