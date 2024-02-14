class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null; 
        }
        
        
        int cnt = 0;
        ListNode temp = head;
        while (temp != null) {
            cnt++;
            temp = temp.next;
        }
        
      
        if (cnt == 1) {
            return null;
        }
        
       
        int middleIndex = cnt / 2;
        temp = head;
        for (int i = 0; i < middleIndex - 1; i++) {
            temp = temp.next;
        }
        
        // Delete the middle node
        temp.next = temp.next.next;
        
        return head;
    }
}

