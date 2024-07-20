// This code is 100% Faster 24 Oct 2022 don't know about future
// If not understanding how to solve ping me with problem no and doubt 
// sahil2001bassan@gmail.com
//                    Kindly UPVOTE If it helps and DOWNVOTE if any issue with the code

class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        ArrayList<Integer> ls = new ArrayList<Integer>();

         for (int i=0; i<n; i++){
             int num = Integer.MAX_VALUE;
             int index = -1;
            for (int j=0; j<m; j++){
                if(matrix[i][j] < num){
                    num = matrix[i][j];
                    index = j;
                }
            }
             boolean flag = true;
             for(int row=0; row<n; row++){
                 if(matrix[row][index] > num ) flag = false;
             }
             if(flag) ls.add(num);
        }

        return ls;
    }
}