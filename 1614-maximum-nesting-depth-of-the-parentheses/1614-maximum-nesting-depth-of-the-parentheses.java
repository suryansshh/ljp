class Solution {
    public int maxDepth(String s) {
       
        if(s.length()==1)return 0;
        Stack<Character> stack = new Stack<>();
        int current = 0 , max = 0;
        for(int i =0 ; i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                stack.push(ch);
                current++;
                max = Math.max(max , current);

            }
            if(ch==')'){
               stack.pop();
               current--;
            }
        }
        return max;
    }
}