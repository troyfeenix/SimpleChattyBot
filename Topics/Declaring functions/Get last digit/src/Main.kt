import java.lang.Math.abs

// write your code here
fun getLastDigit(a: Int): Int {
    return abs(a % 10)
}

/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}