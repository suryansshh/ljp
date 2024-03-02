import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>(); 

        sub(result, new ArrayList<>(), nums, 0);
        return result;
    }

    public void sub(List<List<Integer>> result, List<Integer> subset, int[] nums, int index) {
        result.add(new ArrayList<>(subset));
        for (int i = index; i < nums.length; i++) {
            subset.add(nums[i]);
            sub(result, subset, nums, i + 1);
            subset.remove(subset.size() - 1);
        }
    }
}
