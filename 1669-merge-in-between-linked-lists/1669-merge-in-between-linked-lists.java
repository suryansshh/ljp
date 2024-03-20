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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;

        // Move temp1 to the node right before the 'a'th node
        for (int i = 1; i < a; i++) {
            temp1 = temp1.next;
        }

        // Move temp2 to the last node of list2
        while (temp2.next != null) {
            temp2 = temp2.next;
        }

        // Connect the 'b'th node of list1 to the node after temp2
        ListNode temp3 = temp1;
        for (int i = a; i <= b + 1; i++) {
            temp3 = temp3.next;
        }
        temp1.next = list2;
        temp2.next = temp3;

        return list1;
    }
}
