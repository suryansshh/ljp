class Solution {
    public int beautySum(String s) {
        int ans = 0;
        for (int size = 3; size <= s.length(); size++) {
            for (int i = 0; i <= s.length() - size; i++) {
                int j = i + size - 1;
                int[] freq = new int[26];
                for (int k = i; k <= j; k++) {
                    freq[s.charAt(k) - 'a']++;
                }
                ans += beauty(freq);
            }
        }
        return ans;
    }

    private int beauty(int[] freq) {
        int maxFreq = 0;
        int minFreq = Integer.MAX_VALUE;
        for (int f : freq) {
            if (f > 0) {
                maxFreq = Math.max(maxFreq, f);
                minFreq = Math.min(minFreq, f);
            }
        }
        return maxFreq - minFreq;
    }
}
