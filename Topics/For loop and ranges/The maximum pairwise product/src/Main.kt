fun main() {
    // write your code here
    val N = readLine()!!.toInt()
        val list = arrayListOf<Int>()
        for (i in 1..N) {
            list += readLine()!!.toInt()
        }
    if (N == 1) {
        println(list[0])
    } else {
            list.sort()
            val size = list.size
            val biggest = list[size - 1]
            val big = list[size - 2]
            println(biggest * big)
        }
}