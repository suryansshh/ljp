class Solution {
    public String reverseWords(String s) {
        StringBuilder reversed = new StringBuilder();
        Stack<String> res = new Stack<>();
        String[] words = s.split("\\s+");
        for(String word:words){
            res.push(word);
        }
            while(!res.isEmpty()){
                reversed.append(res.pop()).append(" ");
            }
        return reversed.toString().trim();
    }
}