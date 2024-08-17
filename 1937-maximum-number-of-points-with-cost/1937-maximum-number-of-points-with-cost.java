# Recursion solution gives tle at 47 test case 

class Solution {
    public long find_sum(int[][] points, int row, int col) {
        // base case
        if (row >= points.length) {
            return 0;
        }

        long ans = 0;

        for (int i = 0; i < points[0].length; i++) {
            long sum = points[row][i] - Math.abs(i - col) + find_sum(points, row + 1, i);
            ans = Math.max(ans, sum);
        }

        return ans;
    }

    public long maxPoints(int[][] points) {
        int n = points.length;
        int m = points[0].length;

        long ans = Integer.MIN_VALUE;

        for (int i = 0; i < m; i++) {
            long sum = points[0][i] + find_sum(points, 1, i);
            ans = Math.max(ans, sum);
        }

        return ans;
    }
}

# Memoization gives tle at 143 test case

class Solution {
    public long find_sum(int[][] points, int row, int col, int[][] dp) {
        // base case
        if (row >= points.length) {
            return 0;
        }

        if (dp[row][col] != -1) {
            return dp[row][col];
        }

        long ans = 0;

        for (int i = 0; i < points[0].length; i++) {
            long sum = points[row][i] - Math.abs(i - col) + find_sum(points, row + 1, i, dp);
            ans = Math.max(ans, sum);
        }

        dp[row][col] = ans;
        return ans;
    }

    public long maxPoints(int[][] points) {
        int n = points.length;
        int m = points[0].length;

        long ans = Integer.MIN_VALUE;

        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                dp[i][j] = -1;
            }
        }

        for (int i = 0; i < m; i++) {
            long sum = points[0][i] + find_sum(points, 1, i, dp);
            ans = Math.max(ans, su

# Tabulation accepted 

class Solution {
    public long maxPoints(int[][] points) {
        int n = points.length;
        int m = points[0].length;

        long[][] dp = new long[n + 1][m + 1];

        for (int i = 0; i < m; i++) {
            dp[0][i] = points[0][i];
        }

        for (int i = 1; i < n; i++) {
            long[] left = new long[m];
            long[] right = new long[m];

            left[0] = dp[i - 1][0];
            for (int j = 1; j < m; j++) {
                left[j] = Math.max(left[j - 1] - 1, dp[i - 1][j]);
            }

            right[m - 1] = dp[i - 1][m - 1];
            for (int j = m - 2; j >= 0; j--) {
                right[j] = Math.max(right[j + 1] - 1, dp[i - 1][j]);
            }

            for (int j = 0; j < m; j++) {
                dp[i][j] = points[i][j] + Math.max(left[j], right[j]);
            }
        }

        long ans = Long.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            ans = Math.max(ans, dp[n - 1][i]);
        }

        return ans;
    }
}
