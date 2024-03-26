class Solution {
    public int firstMissingPositive(int[] nums) {
        return sort(nums);
    }
    
    public int sort(int[] nums) {
        int len = nums.length;
        int i = 0;
        while (i < len) {
            int correct = nums[i] - 1;
            if (correct >= 0 && correct < len && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        
        // Iterate through the sorted array to find the first missing positive element
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                return j + 1;
            }
        }
        
        // If all elements are present, return the next positive number
        return nums.length + 1;
    }
    
    public void swap(int[] nums, int i, int correct) {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
}
