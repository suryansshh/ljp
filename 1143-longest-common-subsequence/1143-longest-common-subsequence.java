class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][]dp=new int[text1.length()+1][text2.length()+1];
         for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        
        int ans = helper(text1, text2, 0, 0,dp);
        return ans;
    }

    int helper(String text1, String text2, int i, int j,int [][]dp) {
    
        if (i >= text1.length() || j >= text2.length()) {
            return 0;

        }if(dp[i][j]!=-1){
            return dp[i][j];

        }else if (text1.charAt(i) == text2.charAt(j)) {
           
            return  dp[i][j]=1 + helper(text1, text2, i + 1, j + 1,dp);
        } else {
            
            int f = helper(text1, text2, i + 1, j,dp);
            int s = helper(text1, text2, i, j + 1,dp);
            return dp[i][j]=Math.max(f, s);
        }
    }
}