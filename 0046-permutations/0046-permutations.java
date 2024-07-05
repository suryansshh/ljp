class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        List<Integer> current = new ArrayList<>();
        helper(nums, set, current);
        result.addAll(set);
        return result;
    }

    public void helper(int[] nums, Set<List<Integer>> set, List<Integer> current) {
        if (current.size() == nums.length) {
            set.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (current.contains(nums[i])) {
                continue; // Skip if already used
            }
            current.add(nums[i]);
            helper(nums, set, current);
            current.remove(current.size() - 1); // Backtrack
        }
    }
}