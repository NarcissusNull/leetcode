class Solution {
    fun mctFromLeafValues(arr: IntArray): Int {
        val n = arr.size
        val max = Array(n) { IntArray(n) }
        for (j in 0 until n) {
            var maxValue = arr[j]
            for (i in j downTo 0) {
                maxValue = maxValue.coerceAtLeast(arr[i])
                max[i][j] = maxValue
            }
        }
        val dp = Array(n) { IntArray(n) }
        for (j in 0 until n) {
            for (i in j downTo 0) {
                var min = Int.MAX_VALUE
                var k = i
                while (k + 1 <= j) {
                    min = min.coerceAtMost(dp[i][k] + dp[k + 1][j] + max[i][k] * max[k + 1][j])
                    dp[i][j] = min
                    k++
                }
            }
        }
        return dp[0][n - 1]
    }
}
