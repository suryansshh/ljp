class Solution {
    public int[] separateDigits(int[] nums) {
        Stack<Integer>st=new Stack<>();
        int n=nums.length;
        for(int i=n-1;i>=0;i--){
            int x=nums[i];
            while(x>0){
                st.push(x%10);
                x/=10;
            }
        }
        int[]res=new int[st.size()];
        int i=0;
        while(!st.isEmpty()) res[i++]=st.pop();
        return res;
    }
}