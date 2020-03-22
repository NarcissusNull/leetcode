class Solution {
    fun luckyNumbers (matrix: Array<IntArray>): List<Int> {
        val rowSize = matrix.size
        val colSize: Int = matrix[0].size
        val res: ArrayList<Int> = ArrayList()
        for (i in 0 until rowSize) {
            var colMax = 0
            var rowMin = matrix[i][0]
            var inCol = 0
            for (j in 1 until colSize) {
                if (rowMin > matrix[i][j]) {
                    rowMin = matrix[i][j]
                    inCol = j
                }
            }
            for (x in 0 until rowSize) {
                if (colMax < matrix[x][inCol]) {
                    colMax = matrix[x][inCol]
                }
            }
            if (colMax == rowMin) {
                res.add(rowMin)
                break
            }
        }
        return res
    }
}
