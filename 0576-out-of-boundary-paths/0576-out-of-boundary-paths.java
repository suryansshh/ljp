public class Solution {
    private static final int MOD = 1000000007;
    private int[][][] pathCount;
    private int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        if (maxMove == 0) return 0;
        pathCount = new int[maxMove][m][n];
        for (int movNum = 0; movNum < maxMove; movNum++) {
            for (int r = 0; r < m; r++) {
                for (int c = 0; c < n; c++) {
                    int prevStateContri = 0;
                    for (int[] dir : dirs) {
                        int prevR = dir[0] + r, prevC = c + dir[1];
                        if (withInBound(prevR, prevC, m, n))
                            prevStateContri = (prevStateContri + ((movNum == 0) ? 0 : pathCount[movNum - 1][prevR][prevC])) % MOD;
                        else
                            prevStateContri = (prevStateContri + 1) % MOD;
                    }
                    pathCount[movNum][r][c] = (pathCount[movNum][r][c] + prevStateContri) % MOD;
                }
            }
        }
        return pathCount[maxMove - 1][startRow][startColumn];
    }

    private boolean withInBound(int r, int c, int rows, int cols) {
        return r >= 0 && r < rows && c >= 0 && c < cols;
    }
}
