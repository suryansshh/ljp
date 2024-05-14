class Solution {
    private int row;
    private int col;

    public int getMaximumGold(int[][] grid) {
        int maxSum = 0;
        this.row = grid.length;
        this.col = grid[0].length;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int sum = dfs(grid, i, j);
                maxSum = Math.max(sum, maxSum);
            }
        }
        return maxSum;
    }

    public int dfs(int[][] arr, int i, int j) {
        if (i < 0 || i >= row || j < 0 || j >= col || arr[i][j] == 0) {
            return 0;
        }
        int temp = arr[i][j];
        arr[i][j] = 0; 
        int upSum = dfs(arr, i - 1, j);
        int downSum = dfs(arr, i + 1, j);
        int leftSum = dfs(arr, i, j - 1); // Corrected from i-1 to i and j-1 to j
        int rightSum = dfs(arr, i, j + 1); // Corrected from i+1 to i and j+1 to j
        arr[i][j] = temp; // Restore the original value after recursion
        return temp + Math.max(Math.max(Math.max(upSum, downSum), leftSum), rightSum);
    }
}
