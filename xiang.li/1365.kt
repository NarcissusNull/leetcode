 class Solution {
    fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
        val len = nums.size
        val res = IntArray(len)
        for (i in 0 until len) {
            for (j in 0 until len) { 
                if (i == j) continue
                if (nums[i] > nums[j]) res[i]++
            }
        }
        return res
    }
}
