import java.util.*;

class Solution {
    public List<Integer> resultsArray(int[] nums, int k) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i <= n - k; i++) {
            boolean isConsecutive = true;
            int maxVal = nums[i];

            for (int j = i; j < i + k - 1; j++) {
                if (nums[j] + 1 != nums[j + 1]) {
                    isConsecutive = false;
                    break;
                }
                maxVal = Math.max(maxVal, nums[j + 1]);
            }

            ans.add(isConsecutive ? maxVal : -1);
        }

        return ans;
    }
}