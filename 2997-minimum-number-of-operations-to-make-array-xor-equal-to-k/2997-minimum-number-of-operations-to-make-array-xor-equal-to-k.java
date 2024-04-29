class Solution {
    public int minOperations(int[] nums, int k) {
        int xor = nums[0];
        for(int i = 1 ;i<nums.length;i++){
            xor ^=nums[i];
        }
        if(xor==k){
            return 0;
        }
        return helper(xor , k);
    }
    public int helper(int xor , int k){
        int diffbits=0;
        for(int i =0 ;i<32;i++){
            int lsb = ((xor>>i) &1);
            int rsb = ((k>>i) &1);
            if(lsb!=rsb){
                diffbits++;
            }
        }
        return diffbits;
    }
}