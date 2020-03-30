class Solution {
    fun minFallingPathSum(A: Array<IntArray>): Int {
        val N = A.size
        for (r in N - 2 downTo 0) {
            for (c in 0 until N) {
                var best = A[r + 1][c]
                if (c > 0) best = best.coerceAtMost(A[r + 1][c - 1])
                if (c + 1 < N) best = best.coerceAtMost(A[r + 1][c + 1])
                A[r][c] += best
            }
        }
        var ans = Int.MAX_VALUE
        for (x in A[0]) ans = ans.coerceAtMost(x)
        return ans
    }
}
