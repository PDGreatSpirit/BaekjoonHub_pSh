import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.max

private class Fs {
    private val br = BufferedReader(InputStreamReader(System.`in`))
    private var st: StringTokenizer? = null
    fun nextInt(): Int {
        while (st == null || !st!!.hasMoreTokens()) st = StringTokenizer(br.readLine())
        return st!!.nextToken().toInt()
    }
}

fun main() {
    val fs = Fs()
    val N = fs.nextInt()
    val M = fs.nextInt()

    val a = Array(N) { IntArray(M) }
    var cellMax = 0
    for (i in 0 until N) {
        for (j in 0 until M) {
            val v = fs.nextInt()
            a[i][j] = v
            if (v > cellMax) cellMax = v
        }
    }

    val dy = intArrayOf(1, -1, 0, 0)
    val dx = intArrayOf(0, 0, 1, -1)
    val visited = Array(N) { BooleanArray(M) }
    var ans = 0

    fun dfs(y: Int, x: Int, depth: Int, sum: Int) {
        if (sum + cellMax * (4 - depth) <= ans) return

        if (depth == 4) {
            if (sum > ans) ans = sum
            return
        }
        for (dir in 0 until 4) {
            val ny = y + dy[dir]
            val nx = x + dx[dir]
            if (ny !in 0 until N || nx !in 0 until M) continue
            if (visited[ny][nx]) continue
            visited[ny][nx] = true
            dfs(ny, nx, depth + 1, sum + a[ny][nx])
            visited[ny][nx] = false
        }
    }

    fun checkT(y: Int, x: Int) {
        var arms = 0
        val vals = IntArray(4)
        for (i in 0 until 4) {
            val ny = y + dy[i]
            val nx = x + dx[i]
            if (ny in 0 until N && nx in 0 until M) {
                vals[arms++] = a[ny][nx]
            }
        }
        if (arms < 3) return
        val base = a[y][x]
        if (arms == 3) {
            val s = base + vals[0] + vals[1] + vals[2]
            if (s > ans) ans = s
        } else {
            val total = vals[0] + vals[1] + vals[2] + vals[3]
            var minArm = vals[0]
            for (i in 1 until 4) if (vals[i] < minArm) minArm = vals[i]
            val s = base + (total - minArm)
            if (s > ans) ans = s
        }
    }

    for (y in 0 until N) {
        for (x in 0 until M) {
            visited[y][x] = true
            dfs(y, x, depth = 1, sum = a[y][x])
            visited[y][x] = false
            checkT(y, x)
        }
    }

    println(ans)
}