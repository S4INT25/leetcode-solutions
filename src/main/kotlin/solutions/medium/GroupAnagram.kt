package solutions.medium
//
//Given an array of strings strs, group the anagrams together. You can return the answer in any order.
//
//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
//
//
//
//Example 1:
//
//Input: strs = ["eat","tea","tan","ate","nat","bat"]
//Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
//Example 2:
//
//Input: strs = [""]
//Output: [[""]]
//Example 3:
//
//Input: strs = ["a"]
//Output: [["a"]]


fun groupAnagrams(strs: Array<String>): List<List<String>> {

    val groupedItems = mutableMapOf<String, MutableList<String>>().apply {

        for (it in strs) {
            val sorted = String(it.toCharArray().sortedArray())
            if (!this.containsKey(sorted)) {
                this[sorted] = mutableListOf()
            }
            this[sorted]?.add(it)
        }
    }
    return groupedItems.map { it.value }

}

