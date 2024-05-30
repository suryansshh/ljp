import java.util.HashMap;
import java.util.Map;

class Solution {
    public int countTriplets(int[] arr) {
        int n = arr.length;
        int[] pref = new int[n + 1];
        for (int i = 0; i < n; i++) {
            pref[i + 1] = pref[i] ^ arr[i];
        }

        Map<Integer, Integer> count = new HashMap<>();
        Map<Integer, Integer> total = new HashMap<>();
        int triplets = 0;

        for (int k = 0; k < n; k++) {
            if (count.containsKey(pref[k + 1])) {
                triplets += count.get(pref[k + 1]) * k - total.get(pref[k + 1]);
            }

            count.put(pref[k], count.getOrDefault(pref[k], 0) + 1);
            total.put(pref[k], total.getOrDefault(pref[k], 0) + k);
        }

        return triplets;
    }
}
