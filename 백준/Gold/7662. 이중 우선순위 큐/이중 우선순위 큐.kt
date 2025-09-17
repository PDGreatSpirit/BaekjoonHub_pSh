import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import java.util.TreeMap

private class Fs {
    private val br = BufferedReader(InputStreamReader(System.`in`))
    private var st: StringTokenizer? = null
    fun next(): String {
        while (st == null || !st!!.hasMoreTokens()) st = StringTokenizer(br.readLine())
        return st!!.nextToken()
    }
    fun nextInt(): Int = next().toInt()
    fun nextLong(): Long = next().toLong()
}

fun main() {
    val fs = Fs()
    val T = fs.nextInt()

    repeat(T) {
        val k = fs.nextInt()
        val map = TreeMap<Long , Int>()
        repeat(k) {
            val o = fs.next()
            val n = fs.nextLong()
            when (o) {
                "I" -> {
                    map[n] = (map[n] ?: 0) + 1
                }
                "D"->{
                    if (map.isEmpty()) return@repeat
                    when (n){
                        1L -> {
                            val key = map.lastKey()
                            val cnt = map[key]!! -1
                            if(cnt == 0) map.remove(key) else map[key] = cnt
                        }
                        -1L ->{
                            val key = map.firstKey()
                            val cnt = map[key]!! -1
                            if(cnt == 0) map.remove(key) else map[key] = cnt
                        }

                    }
                }

            }
        }
        if(map.isEmpty()) print("EMPTY\n")
        else print("${map.lastKey()} ${map.firstKey()}\n")
    }
}