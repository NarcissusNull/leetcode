class Solution {
    fun createTargetArray(nums: IntArray, index: IntArray): IntArray {
        val list = ArrayList<Int>()
        for (i in nums.indices) {
            list.add(index[i], nums[i])
        }
        val target = IntArray(nums.size)
        for (i in list.indices) {
            target[i] = list[i]
        }
        return target
    }
}
