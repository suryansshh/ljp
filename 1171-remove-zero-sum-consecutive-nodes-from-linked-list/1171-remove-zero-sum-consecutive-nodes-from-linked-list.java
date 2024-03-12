class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;
        Map<Integer, ListNode> map = new HashMap<>();
        int sum = 0;
        
        while (current != null) {
            sum += current.val;
            if (map.containsKey(sum)) {
                ListNode start = map.get(sum).next;
                int tempSum = sum;
                while (start != current) {
                    tempSum += start.val;
                    map.remove(tempSum);
                    start = start.next;
                }
                map.get(sum).next = current.next;
            } else {
                map.put(sum, current);
            }
            current = current.next;
        }
        
        return dummy.next;
    }
}
