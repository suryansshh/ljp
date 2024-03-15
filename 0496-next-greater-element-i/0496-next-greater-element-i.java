import java.util.*;

public class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        return check(nums1, nums2);
    }

    public int[] check(int[] ar1, int[] ar2) {
        int len1 = ar1.length;
        int len2 = ar2.length;
        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = len2 - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= ar2[i]) {
                st.pop();
            }
            map.put(ar2[i], st.isEmpty() ? -1 : st.peek());
            st.push(ar2[i]);
        }

        int[] result = new int[len1];
        for (int i = 0; i < len1; i++) {
            result[i] = map.get(ar1[i]);
        }
        return result;
    }
}