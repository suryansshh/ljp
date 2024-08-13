class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list  = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        Arrays.sort(candidates);
        help(0 , target , candidates , list , ds);
        return list;
        
    }
    public void help(int ind , int target ,int[] arr , List<List<Integer>> list , List<Integer> ds ){
        if(target==0){
            list.add(new ArrayList<>(ds));
            return;
        }
        for (int i = ind; i < arr.length; i++) {
            if (i > ind && arr[i] == arr[i - 1]) continue;
            if (arr[i] > target) break;

            ds.add(arr[i]);
            help(i + 1, target-arr[i], arr, list, ds);
            ds.remove(ds.size() - 1);
        }
        
        
    }
} 