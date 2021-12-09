// write your function here

fun main() {
    val letter = readLine()!!.first()

    fun isVowel(letter: Char): Boolean {
        return letter == 'A' || letter == 'a' || 
            letter == 'E' || letter == 'e' || 
            letter == 'I' || letter == 'i' || 
            letter == 'O' || letter == 'o' || 
            letter == 'U' || letter == 'u'
    }

    println(isVowel(letter))
}
