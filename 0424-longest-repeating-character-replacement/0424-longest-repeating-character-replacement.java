class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0 , r=0 , maxlen=0 , maxcount =0 ;
        int[] count = new int[26];
        while(r<s.length()){
            char curr = s.charAt(r);
            count[curr-'A']++;
            maxcount = Math.max(maxcount ,count[curr-'A']);
            if(r-l+1-maxcount>k){
                count[s.charAt(l)-'A']--;
                l++;
            }
            maxlen = Math.max(maxlen , r-l+1);
            r++;
        }
        return maxlen;
    }
}