class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        help(list , ds , k , n , 1);
        return list;

    }
    public void help( List<List<Integer>> list ,List<Integer> ds , int k , int n , int len ){
        if(k==0 && n==0){
            list.add(new ArrayList<>(ds));
            return;
        }
        // if(k<=0 || n<=0) {
        //     return;
        // }
    
        for(int i = len ;i<=9;i++){
            ds.add(i);
            help(list , ds , k-1, n-i , i+1);
            ds.remove(ds.size()-1);
        }
    }
}
