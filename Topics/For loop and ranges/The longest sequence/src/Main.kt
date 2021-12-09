fun main() {
    // write your code here
    val range = readLine()!!.toInt()
    val list = arrayListOf<Int>()
    var maxLen = 0
    var currLen = 0
    var currNum = 0
    for (i in 1..range) {
        list += readLine()!!.toInt()
    }
    for (k in list) {
        currLen ++
        if (k >= currNum) {
            currNum = k
        } else {
            currNum = 0
            currLen = 0
        }
        if (currLen > maxLen) {
            maxLen = currLen
        }
    }
    println(maxLen)
}
