fun main() {
    // put your code here
    val first = readLine()!!.toInt()
    val last = readLine()!!.toInt()
    var total = 0
    for (i in first..last) {
        total += i
    }
    println(total)
}