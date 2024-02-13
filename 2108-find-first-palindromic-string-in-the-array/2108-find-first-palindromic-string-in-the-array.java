class Solution {
    public String firstPalindrome(String[] words) {
        for(int i = 0 ; i<words.length;i++){
            if(help(words[i])){
                return words[i];
            }

        }return "";
    }
    public boolean help(String words){
        String temp = words;
        StringBuilder sb = new StringBuilder(words);
        sb.reverse();
        String reverse = sb.toString();
        if(reverse.equals(temp)){
            return true;
        }
       return false;
    }
}