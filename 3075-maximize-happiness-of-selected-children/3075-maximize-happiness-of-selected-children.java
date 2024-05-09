class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        Stack<Integer> st = new Stack<>();
        for(int a:happiness){
            st.push(a);
        }
        long max =0;
        int i =0;
        while(k-- != 0 && !st.isEmpty() ){
            int curr = st.pop();
            if((curr-i)>0){
                max += curr-i;
            }
            i++;
        }
        return max;
    }
}