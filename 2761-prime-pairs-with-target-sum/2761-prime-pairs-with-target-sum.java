import java.util.*;

class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        
        
        for (int i = 2; i * i <= n; i++) {
            if (prime[i]) {
                for (int k = i * i; k <= n; k += i) {
                    prime[k] = false;
                }
            }
        }
        
        List<List<Integer>> result = new ArrayList<>();
        
        // Find pairs of primes that sum up to n
        for (int i = 2; i <= n / 2; i++) {
            if (prime[i] && prime[n - i]) {
                List<Integer> pair = new ArrayList<>();
                pair.add(i);
                pair.add(n - i);
                result.add(pair);
            }
        }
        
        return result;
    }

   
}
