fun main() {
    // write your code here
    val N = readLine()!!.toInt()
    var total = 0
    for (i in 1..N) {
        var num = readLine()!!.toInt()
        total += num
    }
    println(total)
}