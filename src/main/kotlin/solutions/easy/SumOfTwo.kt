package solutions.easy

import java.util.*

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */


fun sumOfTwo(nums: IntArray, target: Int): IntArray {

    val hashMap = HashMap<Int, Int>()

    val res = mutableListOf<Int>()

    for (i in nums.indices) {
        val requiredNumber = target - nums[i]
        if (hashMap.containsKey(requiredNumber)) {
            res.add(i)
            res.add(hashMap.getOrElse(requiredNumber) { 0 })
            break
        }
        hashMap[nums[i]] = i
    }
    return res.toIntArray()
}