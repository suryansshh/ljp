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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode temp = head;
        int count =0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        count = count-n;
        temp = dummy;
        while(count>0){
            temp = temp.next;
            count--;
        }
        temp.next=temp.next.next;
        return dummy.next;
    }
}