package solutions.easy

/*Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward.

For example, 121 is a palindrome while 123 is not.


Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.


Constraints:

-231 <= x <= 231 - 1


Follow up: Could you solve it without converting the integer to a string?
 */


fun palindromeNumber(number: Int): Boolean {
    return try {
        number == reverserInt(number)
    } catch (e: Exception) {
        false
    }
}

private fun reverserInt(target: Int): Int {

    if (target < 0) {
        throw Exception("Negative number")
    }
    val intArray = mutableListOf<Int>()
    var temp = target

    //reverse target value
    do {
        intArray.add(temp % 10)
        temp /= 10
    } while (temp > 0)

    //convert int array to int
    var result = 0
    for (i in intArray.indices) {
        result = result * 10 + intArray[i]
    }
    return result

}