class Solution {
    fun stoneGameII(piles: IntArray): Int {
        val sums: IntArray
        val len = piles.size
        sums = IntArray(len)
        sums[0] = piles[0]
        for (i in 1 until len) {
            sums[i] += sums[i - 1] + piles[i]
        }
        val dp = Array(len + 1) { IntArray(len + 1) }
        for (i in len - 1 downTo 0) {
            for (j in len downTo 1) {
                var max = 0
                var k = i
                while (k < len && k - i + 1 <= 2 * j) {
                    var m = k - i + 1
                    m = j.coerceAtLeast(m)
                    val j1 = len - 1
                    max = max.coerceAtLeast((if (i == 0) {
                        sums[j1]
                    } else {
                        sums[j1] - sums[i - 1]
                    }) - dp[k + 1][m])
                    k++
                }
                dp[i][j] = max
            }
        }
        return dp[0][1]
    }
}
