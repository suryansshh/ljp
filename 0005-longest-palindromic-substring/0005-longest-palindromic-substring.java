class Solution {
    public String longestPalindrome(String s) {
        int max = 0 , start = 0 , end = 0; 
        for(int i = 0; i < s.length() - 1; i++) { 
            for(int j = i; j < s.length(); j++) {
                if(isPal(s , i , j )) {
                    if((j-i+1) > max) {
                        max = j-i+1;
                        start = i ; 
                        end = j ;
                    }
                }
            }
        }
        return s.substring(start ,end+1);
    }
    public boolean isPal(String s ,int i , int j){
        while(i < j) { // Corrected loop condition
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            if(ch1 != ch2) return false;
            
            i++; 
            j--;
        }
        return true;
    }
}
