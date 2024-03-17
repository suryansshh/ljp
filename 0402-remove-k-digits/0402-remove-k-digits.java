import java.util.Stack;

public class Solution {
    public String removeKdigits(String num, int k) {
        if(k==num.length()) return "0";
         return remove(num, k);
    }

    public String remove(String arr, int k) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length(); i++) {
            char ch = arr.charAt(i);
            while (!st.isEmpty() && k > 0 && st.peek() > ch) {
                st.pop();
                k--;
            }
            st.push(ch);
        }

        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }

        while (!st.isEmpty()) {
            sb.insert(0, st.pop());
        }

        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.toString();
    }
}
