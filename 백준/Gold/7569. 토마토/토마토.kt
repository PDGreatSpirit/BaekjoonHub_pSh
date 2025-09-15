import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue
import java.util.StringTokenizer
import kotlin.math.max

class fs {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st: StringTokenizer ?= null
    fun nextInt(): Int {
        while (st == null || !st!!.hasMoreTokens()) {
            st = StringTokenizer(br.readLine())
        }
        return st!!.nextToken().toInt()
    }
}
fun main(){
    val dx = intArrayOf(1, -1, 0, 0, 0, 0)
    val dy = intArrayOf(0, 0, 1, -1, 0, 0)
    val dz = intArrayOf(0, 0, 0, 0, 1, -1)

    val fs = fs();
    val m = fs.nextInt()
    val n = fs.nextInt()
    val h = fs.nextInt()

    val al = m*n*h
    val grid = IntArray(al)
    val days = IntArray(al){-1}
    val q : Queue<Int> = LinkedList()
    fun idx(z: Int, y: Int, x: Int) = (z * n + y) * m + x
    for (z in 0 until h) {
        for (y in 0 until n) {
            for (x in 0 until m) {
                val v = fs.nextInt()
                val id = idx(z, y, x)
                grid[id] = v
                if (v == 1) {
                    days[id] = 0
                    q.add(id)
                }
            }
        }
    }
    while (q.isNotEmpty()) {
        val cur = q.poll()
        val cz = cur / (n * m)
        val rem = cur % (n * m)
        val cy = rem / m
        val cx = rem % m

        val cd = days[cur]
        for (dir in 0 until 6) {
            val nz = cz + dz[dir]
            val ny = cy + dy[dir]
            val nx = cx + dx[dir]
            if (nz !in 0 until h || ny !in 0 until n || nx !in 0 until m) continue
            val nid = idx(nz, ny, nx)

            if (grid[nid] == 0 && days[nid] == -1) {
                days[nid] = cd + 1
                grid[nid] = 1
                q.add(nid)
            }
        }
    }

    var ans = 0
    for (i in 0 until al) {
        if (grid[i] == 0) {
            println(-1)
            return
        }
        if (days[i] >= 0) ans = max(ans, days[i])
    }
    println(ans)
}
