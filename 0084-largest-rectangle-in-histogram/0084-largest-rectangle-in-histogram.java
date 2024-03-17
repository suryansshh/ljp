class Solution {
    public int largestRectangleArea(int[] heights) {
        return check(heights);
    }
    public int check(int[] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] leftsmall = new int[n];
        int[] rightsmall = new int[n];
        for(int i = 0 ;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()] >=arr[i]){
                st.pop();
            }
            if(st.isEmpty()) leftsmall[i]=0;
            else leftsmall[i]=st.peek()+1;
            st.push(i);
        }
        while(!st.isEmpty()) st.pop();
        for(int i =n-1 ;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()) rightsmall[i]=n-1;
            else rightsmall[i]=st.peek()-1;
            st.push(i);
        }
        int maxA = 0;
        for(int i = 0;i<n;i++){
            maxA = Math.max(maxA  ,arr[i] * (rightsmall[i] - leftsmall[i]+1));

        }
        return maxA;
    }
}