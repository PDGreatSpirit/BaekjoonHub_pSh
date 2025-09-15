import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().trim().toInt()
    val g = Array(n) { IntArray(n) }

    for (i in 0 until n) {
        val x  = StringTokenizer(br.readLine())
        for (k in 0 until n) {
            g[i][k] = x.nextToken().toInt();
        }
    }

    for (k in 0 until n) {
        for (i in 0 until n) {
            if (g[i][k] == 1) {              // 최적화: i→k 없으면 스킵
                for (j in 0 until n) {
                    if (g[k][j] == 1) g[i][j] = 1
                }
            }
        }
    }

    val sb = StringBuilder()
    for (i in 0 until n) {
        for (j in 0 until n) {
            sb.append(g[i][j])
            if (j + 1 < n) sb.append(' ')
        }
        sb.append('\n')
    }
    print(sb.toString())

}
