class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        help(list , ds , nums , 0);
        return list;
    }
    public void help(List<List<Integer>> list, List<Integer> ds, int[] arr , int len ){
        list.add(new ArrayList<>(ds));
        for(int i = len ; i<arr.length;i++){
            if(i>len && arr[i]==arr[i-1]) continue;
            ds.add(arr[i]);
            help(list , ds , arr , i+1);
            ds.remove(ds.size()-1);
        }
    }
}