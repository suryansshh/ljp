class Solution {
    public int nextBeautifulNumber(int n) {
        int num = n + 1;

        while (true) {
            if (isBalanced(num)) return num;
            num++;
        }
    }

    private boolean isBalanced(int num) {
        int[] freq = new int[10];
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            freq[digit]++;
            temp /= 10;
        }

        for (int i = 1; i <= 9; i++) {
            if (freq[i] != 0 && freq[i] != i) {
                return false;
            }
        }

        if (freq[0] > 0) return false;

        return true;
    }
}
