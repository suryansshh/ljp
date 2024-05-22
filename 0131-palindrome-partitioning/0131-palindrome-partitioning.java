class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();
        List<String> ds= new ArrayList<>();
        help(list , ds , s , 0);
        return list;

    }
    public void help(List<List<String>> list , List<String> ds , String s , int len ){
        if(len ==s.length()){
            list.add(new ArrayList<>(ds));
            return;
        }
        for(int i = len ;i<s.length();i++){
            if(isPal( s , len , i)){
                ds.add(s.substring(len , i+1));
                help(list , ds , s , i+1);
                ds.remove(ds.size()-1);
            }
        }
    }
    boolean isPal(String s , int start , int end){
        while(start<=end){
            if(s.charAt(start++)!=s.charAt(end--)) {
                return false;
            }
        }
        return true;
    }
}