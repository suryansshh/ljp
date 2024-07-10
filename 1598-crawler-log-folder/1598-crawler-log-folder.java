class Solution {
    public int minOperations(String[] logs) {
        int depth =0 ;
        for(String st:logs){
            if(st.equals("../")){
                if(depth>0){
                    depth--;
                }
            }
            else if(!st.equals("./"))depth++;
        }
        return depth;
    }
}