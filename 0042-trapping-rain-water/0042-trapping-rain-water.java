class Solution {
    public int trap(int[] height) {
        int left = 0, right = height.length - 1, totalWater = 0, leftMax = 0, rightMax = 0;
        while (left <= right) {
            leftMax = Math.max(height[left], leftMax);
            rightMax = Math.max(height[right], rightMax);
			 
            if (leftMax < rightMax) {
                totalWater += leftMax - height[left++];
            } else {
                totalWater += rightMax - height[right--];
            }
        }
        return totalWater;
    }
}
