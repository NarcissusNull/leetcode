class Solution {
    fun stoneGame(piles: IntArray): Boolean {
        val length = piles.size
        val dp = Array(length) { Array(length) { IntArray(2) } }
        for (i in 0 until length) {
            dp[i][i][0] = piles[i]
            dp[i][i][1] = 0
        }
        for (i in 0 until length - 1) {
            for (k in 1 until length) {
                val getRight = dp[i][k - 1][1] + dp[k][k][0]
                val getLeft = dp[i + 1][k][1] + dp[i][i][0]
                if (getLeft > getRight) {
                    dp[i][k][0] = getLeft
                    dp[i][k][1] = dp[i + 1][k][0]
                } else {
                    dp[i][k][0] = getRight
                    dp[i][k][1] = dp[i][k - 1][0]
                }
            }
        }
        return dp[length - 1][length - 1][0] - dp[length - 1][length - 1][1] > 0
    }
}
