import java.util.ArrayList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode() { this.val = 0; this.next = null; }
    ListNode(int x) { this.val = x; this.next = null; }
    ListNode(int x, ListNode next) { this.val = x; this.next = next; }
}

class Solution {
    public List<ListNode> splitListToParts(ListNode head, int k) {
        List<ListNode> ans = new ArrayList<>();
        ListNode temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        int equal = count / k;
        int extra = count % k;

        ListNode prevHead = head;

        while (k-- > 0) {
            int t = equal;
            if (extra > 0) {
                t++;
                extra--;
            }
            ListNode newHead = prevHead;
            ListNode current = newHead;
            while (newHead != null && t-- > 1) {
                newHead = newHead.next;
            }

            if (newHead != null) {
                prevHead = newHead.next;
                newHead.next = null;
            }
            ans.add(current);
        }

        return ans;
    }
}