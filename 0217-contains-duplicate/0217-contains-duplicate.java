class Solution {
    public boolean containsDuplicate(int[] nums) {
        // array sort karo 
        // check if the next value is same as the last one othorught the array 
        Arrays.sort(nums);
        for(int i = 0 ;i<nums.length;i++){
            if(nums[i] == nums[i+1]) return false;
        }
        return true;
    }
}