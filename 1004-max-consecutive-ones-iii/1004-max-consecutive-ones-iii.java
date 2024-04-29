class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0, r = 0, zeros = 0, maxLen = 0;

        while (r < nums.length) {
            if (nums[r] == 0) {
                zeros++;
            }

            while (zeros > k) {
                if (nums[l] == 0) {
                    zeros--;
                }
                l++;
            }

            int currLen = r - l + 1;
            maxLen = Math.max(maxLen, currLen);
            r++;
        }

        return maxLen;
    }
}
