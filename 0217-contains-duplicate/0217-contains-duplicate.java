import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Sort the array
        Arrays.sort(nums);
        
        // Loop till second last element to avoid ArrayIndexOutOfBoundsException
        for (int i = 0; i < nums.length - 1; i++) {
            // Check if current element is equal to the next
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        
        // No duplicates found
        return false;
    }
}
