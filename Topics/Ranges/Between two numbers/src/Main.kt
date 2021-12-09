fun main() {
    // write your code here
    val check = readLine()!!.toInt()
    val start = readLine()!!.toInt()
    val end = readLine()!!.toInt()
    println(check in start..end)
}