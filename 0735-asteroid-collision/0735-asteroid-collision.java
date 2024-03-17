
import java.util.Stack;

public class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for (int asteroid : asteroids) {
            handleCollision(st, asteroid);
        }

        int[] result = new int[st.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = st.pop();
        }
        return result;
    }

    private void handleCollision(Stack<Integer> st, int asteroid) {
        while (!st.isEmpty() && asteroid < 0 && st.peek() > 0 && st.peek() < Math.abs(asteroid)) {
            st.pop(); // Incoming asteroid destroys the one on top of the stack
        }

        if (!st.isEmpty() && asteroid < 0 && st.peek() > 0 && st.peek() == Math.abs(asteroid)) {
            st.pop(); // Both asteroids destroy each other
        } else if (asteroid > 0 || (st.isEmpty() || st.peek() < 0)) {
            st.push(asteroid); // No collision or remaining asteroid moves to the right
        }
    }
}