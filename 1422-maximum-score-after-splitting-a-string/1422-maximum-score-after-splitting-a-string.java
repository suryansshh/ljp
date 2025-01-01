class Solution {
    public int maxScore(String s) {
        int ones = 0, zeroes = 0, score = 0;

        // Count total ones in the string
        for (char c : s.toCharArray()) {
            if (c == '1') {
                ones++;
            }
        }

        // Traverse the string
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                zeroes++;
            } else {
                ones--;
            }
            score = Math.max(score, zeroes + ones);
        }

        return score;
    }
}