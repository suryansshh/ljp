import java.util.Stack;
import java.util.ArrayList;

class MinStack {
    Stack<Integer> st = new Stack<>();
    ArrayList<Integer> min = new ArrayList<>();
    int top = -1;

    public MinStack() {

    }

    public void push(int val) {
        if (top == -1) {
            min.add(val);
        } else {
            int currentMin = min.get(top);
            if (val < currentMin) {
                min.add(val);
            } else {
                min.add(currentMin);
            }
        }
        st.push(val);
        top++;
    }

    public void pop() {
        if (top != -1) {
            st.pop();
            min.remove(top);
            top--;
        }
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return min.get(top);
    }
}