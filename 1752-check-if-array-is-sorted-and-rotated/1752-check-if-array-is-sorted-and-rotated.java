class Solution {
    public boolean check(int[] nums) {
        boolean check_asc = check_ascending(nums);
        boolean check_dsc = check_descending(nums);
        return (check_asc == check_dsc);    
    }

    // Corrected the method name and parameter
    public boolean check_ascending(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) count++;
        }
        return (count >= 1) ? true : false;
    }

    // Corrected parameter and fixed syntax error
    public boolean check_descending(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) count++;
        }
        return (count >= 1) ? true : false;
    }
}
