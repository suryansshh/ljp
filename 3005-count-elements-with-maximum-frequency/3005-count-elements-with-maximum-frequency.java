class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = Integer.MIN_VALUE;
        
        // Count occurrences of each number
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            count = Math.max(count, map.get(nums[i])); // Update max frequency
        }
        
        int sum = 0;
        // Sum up frequencies equal to max frequency
        for (int value : map.values()) {
            if (value == count) {
                sum += value;
            }
        }
        
        return sum;
    }
}
