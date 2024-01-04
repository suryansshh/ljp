public class Solution {
    public int minOperations(int[] nums) {
        // Create a HashMap to store the frequency of each unique element
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int count = 0;

        // Step 1: Build the frequency map
        for (int x : nums) {
            frequencyMap.put(x, frequencyMap.getOrDefault(x, 0) + 1);
        }

        // Step 2: Iterate through the frequency map
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int freq = entry.getValue();

            // Check if a single element cannot be used in any operation
            if (freq == 1) {
                return -1;
            }

            // Step 3: Calculate the number of operations for the current element
            count += freq / 3;

            // If there are remaining elements, add one more operation to the count
            if (freq % 3 != 0) {
                count++;
            }
        }

        // Step 4: Return the total count, representing the minimum operations required
        return count;
    }
}