package solutions.easy

import java.util.function.IntPredicate



fun romanToInt(s: String): Int {

    val romanChars = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    if (s.isEmpty()) return 0
    val hasValidRomanChars = s.any { romanChars.containsKey(it) }
    if (!hasValidRomanChars) return 0


    var result = 0
    var prevChar = s[0]
    for (i in 1 until s.length) {
        val currChar = s[i]
        val currVal = romanChars[currChar]
        val prevVal = romanChars[prevChar]
        if (currVal!! > prevVal!!) {
            result -= prevVal
        } else {
            result += prevVal
        }
        prevChar = currChar
    }

    return result + romanChars[prevChar]!!

}



