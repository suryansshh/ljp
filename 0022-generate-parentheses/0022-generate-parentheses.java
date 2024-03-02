class Solution {
    public List<String> generateParenthesis(int n) {
       ArrayList<String> list = new ArrayList<>();
        generaParan("", list , 0 , 0 , n);
        return list;
    }
    public void generaParan(String s ,List<String> list , int open , int close , int n){
        if(s.length()==2*n){
            list.add(s);
            return;
        }
        if(open<n){
            generaParan(s+"(", list, open+1 , close, n);
        }
        if(close<open){
            generaParan(s+")", list , open , close+1 , n);
        }
    }
}