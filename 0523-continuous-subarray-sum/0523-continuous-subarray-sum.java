class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        if (nums == null || nums.length < 2) return false;
        return helper(nums, k);
    }
    
    private boolean helper(int[] nums, int k) {
        int n = nums.length;
        
        for (int left = 0; left < n - 1; left++) {
            int sum = nums[left];
            for (int right = left + 1; right < n; right++) {
                sum += nums[right];
                if (k == 0) {
                    if (sum == 0) return true;
                } else {
                    if (sum % k == 0) return true;
                }
            }
        }
        return false;
    }
}
