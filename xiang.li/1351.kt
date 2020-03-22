class Solution {
    fun countNegatives(grid: Array<IntArray>): Int {
        var cnt = 0
        for (i in grid.indices) {

            //按列非递增
            if (grid[i][0] < 0) {
                cnt += (grid.size - i) * grid[0].size
                break
            }
            for (j in 0 until grid[i].size) {

                //按行非递增
                if (grid[i][j] < 0) {
                    cnt += grid[i].size - j
                    break
                }
            }
        }
        return cnt
    }
}
