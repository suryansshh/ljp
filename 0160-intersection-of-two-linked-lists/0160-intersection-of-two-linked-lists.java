public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ta = headA;
        ListNode tb = headB;
        
        // Get the lengths of both lists
        int lenA = getLength(headA);
        int lenB = getLength(headB);
        
        // Move pointers to the same starting position from the intersection point
        while (lenA > lenB) {
            ta = ta.next;
            lenA--;
        }
        while (lenB > lenA) {
            tb = tb.next;
            lenB--;
        }
        
        // Find the intersection point
        while (ta != null && tb != null) {
            if (ta == tb) {
                return ta;
            }
            ta = ta.next;
            tb = tb.next;
        }
        
        // No intersection found
        return null;
    }
    
    private int getLength(ListNode head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }
}

