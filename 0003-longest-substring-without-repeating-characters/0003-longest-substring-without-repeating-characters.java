import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        if (s.equals(" ")) return 1;

        int maxLen = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            Set<Character> set = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                if (set.contains(s.charAt(j))) {
                    maxLen = Math.max(maxLen, j - i);
                    break;
                }
                set.add(s.charAt(j));
                if (j == s.length() - 1) {
                    maxLen = Math.max(maxLen, j - i + 1); // Update maxLen for the last substring
                }
            }
        }
        return maxLen;
    }
}
