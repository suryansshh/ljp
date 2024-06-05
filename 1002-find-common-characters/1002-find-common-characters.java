import java.util.*;

class Solution {
    public List<String> commonChars(String[] words) {
        List<String> list = new ArrayList<>();
        int[] minFreq = new int[26];
        Arrays.fill(minFreq, Integer.MAX_VALUE);
        
        for (String word : words) {
            int[] charFreq = new int[26];
            for (char ch : word.toCharArray()) {
                charFreq[ch - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                minFreq[i] = Math.min(minFreq[i], charFreq[i]);
            }
        }
        
        for (int i = 0; i < 26; i++) {
            while (minFreq[i] > 0) {
                list.add(String.valueOf((char) (i + 'a')));
                minFreq[i]--;
            }
        }
        
        return list;
    }
}
