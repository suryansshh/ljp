import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            map.put(num, 1);
        }
        
        List<Integer> intersection = new ArrayList<>();
        for (int num : nums2) {
            if (map.containsKey(num)) {
                intersection.add(num);
                map.remove(num); 
            }
        }
        
        int[] res = new int[intersection.size()];
        int index = 0;
        for (int num : intersection) {
            res[index++] = num;
        }
        
        return res;
    }
}
