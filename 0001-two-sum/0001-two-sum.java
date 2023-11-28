class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int[] indices = new int[2];
        for(int i = 0; i < len; i++) {
            for(int j = i + 1; j < len; j++) {
                if(nums[i] + nums[j] == target) {
                    indices[0] = i;
                    indices[1] = j;
                    return indices;
                }
            }
        }
        // If no match found, return empty array
        return new int[0];
    }
}
