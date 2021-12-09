fun main() {
    val rng1Begin = readLine()!!.toInt()
    val rng1End = readLine()!!.toInt()
    val rng2Begin = readLine()!!.toInt()
    val rng2End = readLine()!!.toInt()
    val test = readLine()!!.toInt()
    println(test in rng1Begin..rng1End && test in rng2Begin..rng2End)
}