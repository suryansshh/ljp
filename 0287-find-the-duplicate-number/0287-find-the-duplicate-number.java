class Solution {
    public int findDuplicate(int[] nums) {
        int dubno = 0;
        int n =nums.length;
        Arrays.sort(nums);
        for(int i = 0 ; i<n-1;i++){
            if(nums[i]==nums[i+1]) dubno = nums[i];
        }
        return dubno;
    }
}