class MyStack {
    Queue<Integer> q1 = new LinkedList<>();
    
    public MyStack() {
        
    }
    
    public void push(int x) {
        q1.offer(x); // Add the new element to the queue

        // Rotate the queue so that the new element is at the front
        int size = q1.size();
        for (int i = 0; i < size - 1; i++) {
            q1.offer(q1.poll());
        }
    }
    
    public int pop() {
        return q1.poll();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}