import java.util.HashMap;
import java.util.Map;

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int count = 0;
        int cumulativeSum = 0;
        Map<Integer, Integer> remainderMap = new HashMap<>();
        
        // Initialize the map with the remainder 0 having frequency 1
        remainderMap.put(0, 1);
        
        for (int num : nums) {
            cumulativeSum += num;
            
            // Find the remainder of the cumulative sum
            int remainder = cumulativeSum % k;
            
            // Adjust negative remainders to be positive
            if (remainder < 0) {
                remainder += k;
            }
            
            // If this remainder has been seen before, add the count of those occurrences
            if (remainderMap.containsKey(remainder)) {
                count += remainderMap.get(remainder);
            }
            
            // Update the count of this remainder in the map
            remainderMap.put(remainder, remainderMap.getOrDefault(remainder, 0) + 1);
        }
        
        return count;
    }
}

