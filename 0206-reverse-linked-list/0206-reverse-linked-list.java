
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode nextNode;
        ListNode prev = null;
        
        while(current != null){
            nextNode = current.next; // Store the next node
            current.next = prev;     // Reverse the pointer
            prev = current;          // Move prev to current
            current = nextNode;      // Move current to next node
        }
        
        // After the loop, prev will be pointing to the last node,
        // which becomes the new head of the reversed list
        return prev;
    }
}
