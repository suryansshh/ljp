class Solution {
    public void moveZeroes(int[] nums) {
        help(nums, nums.length);
    }

    public void help(int[] arr, int len) {
        int j = -1;

        // Find the first zero
        for (int i = 0; i < len; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        if (j != -1) {
            for (int i = j + 1; i < len; i++) {
                if (arr[i] != 0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    j++;
                }
            }
        }
    }
}
