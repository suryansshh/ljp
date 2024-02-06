class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        
        int m = matrix.length;
        int n = matrix[0].length;

        int sumRow[] = new int[n];
        int ans = 0;

        for(int i = 0; i < m; i++) { // i is the starting row
            Arrays.fill(sumRow, 0);
            for(int j = i; j < m; j++) { // j is the ending row
                for(int k = 0; k < n; k++) { // k is the column
                    sumRow[k] += matrix[j][k];
                }
                ans += subarraySum(sumRow, target);
            }
        }
        return ans;
    }

    public int subarraySum(int[] nums, int k) {
        
        int sum = 0;
        int ans = 0;

        Map<Integer, Integer> prefixSum = new HashMap<>();
        prefixSum.put(0, 1);

        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(prefixSum.containsKey(sum - k)) {
                ans += prefixSum.get(sum - k);
            }
            prefixSum.put(sum, prefixSum.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
}