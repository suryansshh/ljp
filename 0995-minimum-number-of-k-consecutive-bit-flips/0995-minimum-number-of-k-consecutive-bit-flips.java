class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int n = nums.length;
        int[] isFlipped = new int[n];
        int flipCount = 0;  
        int currentFlips = 0; 

        for (int i = 0; i < n; i++) {
            if (i >= k) {
                currentFlips ^= isFlipped[i - k];
            }

            if (nums[i] == currentFlips) {
                if (i + k > n) {
                    return -1;  
                }

                isFlipped[i] = 1;
                currentFlips ^= 1;
                flipCount++;
            }
        }

        return flipCount;
    }
}
