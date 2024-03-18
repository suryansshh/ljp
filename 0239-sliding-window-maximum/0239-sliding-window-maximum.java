class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
    return check(nums , k);        
   }
   public int[] check(int[] arr , int k ){
    int[] result = new int[arr.length - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();
        int resultIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            while (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }
            while (!deque.isEmpty() && arr[deque.peekLast()] < arr[i]) {
                deque.pollLast();
            }
            deque.offer(i);
            if (i >= k - 1) {
                result[resultIndex++] = arr[deque.peek()];
            }
        }

        return result;
 
   }
}