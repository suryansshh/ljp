import java.util.*;
class Solution {
    private List<List<Integer>> ans;
    public List<List<Integer>> findMatrix(int[] nums) {
        ans = new Vector<>();
        for(int i = 0 ; i < nums.length ; ++i){
            Boolean insert = false;
            for(int j = 0 ; j < ans.size() ; ++j){
                Boolean check = false;
                for(int k = 0; k < ans.get(j).size(); ++k){
                    if(ans.get(j).get(k) == nums[i]){
                        check = true;
                    }
                }
                if(!check){
                    ans.get(j).add(nums[i]);
                    insert = true;
                    break;
                }
            }
            if(!insert){
                List<Integer> temp = new Vector<>();
                temp.add(nums[i]);
                ans.add(temp);
            }
        }
        return ans;
    }
}