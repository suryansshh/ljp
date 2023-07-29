class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String sum = "";
        String sum2 = ""; 
        for(String s1:word1){
            sum = sum + s1;
        }
        for(String s2 : word2){
            sum2 = sum2+ s2;
        }
        if(sum.equals(sum2)){
            return true;
        }
        else {
            return false;
        }
    }
}